/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorProxy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVoiceConnectorProxyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The proxy configuration details.
     * </p>
     */
    private Proxy proxy;

    /**
     * <p>
     * The proxy configuration details.
     * </p>
     * 
     * @param proxy
     *        The proxy configuration details.
     */

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    /**
     * <p>
     * The proxy configuration details.
     * </p>
     * 
     * @return The proxy configuration details.
     */

    public Proxy getProxy() {
        return this.proxy;
    }

    /**
     * <p>
     * The proxy configuration details.
     * </p>
     * 
     * @param proxy
     *        The proxy configuration details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVoiceConnectorProxyResult withProxy(Proxy proxy) {
        setProxy(proxy);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProxy() != null)
            sb.append("Proxy: ").append(getProxy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVoiceConnectorProxyResult == false)
            return false;
        GetVoiceConnectorProxyResult other = (GetVoiceConnectorProxyResult) obj;
        if (other.getProxy() == null ^ this.getProxy() == null)
            return false;
        if (other.getProxy() != null && other.getProxy().equals(this.getProxy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProxy() == null) ? 0 : getProxy().hashCode());
        return hashCode;
    }

    @Override
    public GetVoiceConnectorProxyResult clone() {
        try {
            return (GetVoiceConnectorProxyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
