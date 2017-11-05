/*
 * Copyright 2014 - 2017 Blazebit.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.blazebit.persistence.view.impl.metamodel;

/**
 *
 * @author Christian Beikov
 * @since 1.2.0
 */
public class FlatViewTypeImpl<X> extends ManagedViewTypeImpl<X> implements FlatViewTypeImplementor<X> {

    public FlatViewTypeImpl(ViewMapping viewMapping, MetamodelBuildingContext context) {
        super(viewMapping, context);
    }

    @Override
    protected boolean hasId() {
        return false;
    }

    @Override
    public MappingType getMappingType() {
        return MappingType.FLAT_VIEW;
    }
}