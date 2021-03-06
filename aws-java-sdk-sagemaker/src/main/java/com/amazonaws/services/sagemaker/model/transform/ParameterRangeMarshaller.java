/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ParameterRangeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ParameterRangeMarshaller {

    private static final MarshallingInfo<StructuredPojo> INTEGERPARAMETERRANGESPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IntegerParameterRangeSpecification").build();
    private static final MarshallingInfo<StructuredPojo> CONTINUOUSPARAMETERRANGESPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContinuousParameterRangeSpecification").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORICALPARAMETERRANGESPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoricalParameterRangeSpecification").build();

    private static final ParameterRangeMarshaller instance = new ParameterRangeMarshaller();

    public static ParameterRangeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ParameterRange parameterRange, ProtocolMarshaller protocolMarshaller) {

        if (parameterRange == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(parameterRange.getIntegerParameterRangeSpecification(), INTEGERPARAMETERRANGESPECIFICATION_BINDING);
            protocolMarshaller.marshall(parameterRange.getContinuousParameterRangeSpecification(), CONTINUOUSPARAMETERRANGESPECIFICATION_BINDING);
            protocolMarshaller.marshall(parameterRange.getCategoricalParameterRangeSpecification(), CATEGORICALPARAMETERRANGESPECIFICATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
