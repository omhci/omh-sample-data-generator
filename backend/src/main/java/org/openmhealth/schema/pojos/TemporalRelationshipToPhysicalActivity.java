/*
 * Copyright 2014 Open mHealth
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openmhealth.schema.pojos;

/**
 * @author Danilo Bonilla
 */
public enum TemporalRelationshipToPhysicalActivity implements LabeledEnum {

    at_rest("at rest"),
    active("active"),
    before_exercise("before exercise"),
    after_exercise("after exercise"),
    during_exercise("during exercise");

    private String label;

    TemporalRelationshipToPhysicalActivity(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public static TemporalRelationshipToPhysicalActivity valueForLabel(String label) {
        for (
            TemporalRelationshipToPhysicalActivity val :
            TemporalRelationshipToPhysicalActivity.values()
            ) {
            if (val.getLabel().equals(label)) {
                return val;
            }
        }
        return null;
    }

}
