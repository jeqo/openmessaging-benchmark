/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.openmessaging.benchmark.worker.commands;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TopicsInfo {
    public Set<String> topicNames;
    public int numberOfTopics;
    public int numberOfPartitionsPerTopic;

    public TopicsInfo() {}

    public TopicsInfo(int numberOfTopics, int numberOfPartitionsPerTopic) {
        this.topicNames = Collections.emptySet();
        this.numberOfTopics = numberOfTopics;
        this.numberOfPartitionsPerTopic = numberOfPartitionsPerTopic;
    }

    public TopicsInfo(String[] topicNames, int numberOfTopics, int numberOfPartitionsPerTopic) {
        this.topicNames = new HashSet<>(Arrays.asList(topicNames));
        this.numberOfTopics = numberOfTopics;
        this.numberOfPartitionsPerTopic = numberOfPartitionsPerTopic;
    }
}
