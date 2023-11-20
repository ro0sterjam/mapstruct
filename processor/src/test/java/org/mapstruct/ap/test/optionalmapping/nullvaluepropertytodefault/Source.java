/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.optionalmapping.nullvaluepropertytodefault;

import java.util.Objects;
import java.util.Optional;

@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
public class Source {

    private Optional<SubType> optionalToOptional;
    private SubType nonOptionalToOptional;

    public Optional<SubType> publicOptionalToOptional;
    public SubType publicNonOptionalToOptional;

    public Optional<SubType> getOptionalToOptional() {
        return optionalToOptional;
    }

    public void setOptionalToOptional(Optional<SubType> optionalToOptional) {
        this.optionalToOptional = optionalToOptional;
    }

    public SubType getNonOptionalToOptional() {
        return nonOptionalToOptional;
    }

    public void setNonOptionalToOptional(SubType nonOptionalToOptional) {
        this.nonOptionalToOptional = nonOptionalToOptional;
    }

    public static class SubType {
        
        private final String value;

        public SubType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if ( this == o ) {
                return true;
            }
            if ( o == null || getClass() != o.getClass() ) {
                return false;
            }
            SubType subType = (SubType) o;
            return Objects.equals( value, subType.value );
        }

        @Override
        public int hashCode() {
            return Objects.hash( value );
        }
    }
    
}
