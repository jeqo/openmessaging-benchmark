public_key_path = "~/.ssh/kafka_aws.pub"
region          = "eu-central-1"
az              = "eu-central-1a"
ami             = "ami-03cbad7144aeda3eb" // RHEL-9
assume_role     = "arn:aws:iam::450367589208:role/AivenDeveloperAccess"

instance_types = {
  "kafka"     = "d2.4xlarge"
  "zookeeper" = "t2.small"
  "client"    = "c5.4xlarge"
}

num_instances = {
  "client"    = 2
  "kafka"     = 0
  "zookeeper" = 0
}
