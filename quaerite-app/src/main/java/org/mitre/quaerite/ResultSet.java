/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mitre.quaerite;

import java.util.List;

public class ResultSet {

    private final long totalHits;
    private final long queryTime;
    private final long elapsedTime;
    private final List<String> ids;

    public ResultSet(long totalHits, long queryTime, long elapsedTime, List<String> ids) {
        this.totalHits = totalHits;
        this.queryTime = queryTime;
        this.elapsedTime = elapsedTime;
        this.ids = ids;
    }

    public long getTotalHits() {
        return totalHits;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    public long getQueryTime() {
        return queryTime;
    }
    public int size() {
        return ids.size();
    }

    public String get(int i) {
        return ids.get(i);
    }

    @Override
    public String toString() {
        return "ResultSet{" +
                "totalHits=" + totalHits +
                ", queryTime=" + queryTime +
                ", elapsedTime=" + elapsedTime +
                ", ids=" + ids +
                '}';
    }
}
