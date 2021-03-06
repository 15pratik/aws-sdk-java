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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result structure for the get webhook request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetWebhook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWebhookResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the structure of a webhook.
     * </p>
     */
    private Webhook webhook;

    /**
     * <p>
     * Describes the structure of a webhook.
     * </p>
     * 
     * @param webhook
     *        Describes the structure of a webhook.
     */

    public void setWebhook(Webhook webhook) {
        this.webhook = webhook;
    }

    /**
     * <p>
     * Describes the structure of a webhook.
     * </p>
     * 
     * @return Describes the structure of a webhook.
     */

    public Webhook getWebhook() {
        return this.webhook;
    }

    /**
     * <p>
     * Describes the structure of a webhook.
     * </p>
     * 
     * @param webhook
     *        Describes the structure of a webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebhookResult withWebhook(Webhook webhook) {
        setWebhook(webhook);
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
        if (getWebhook() != null)
            sb.append("Webhook: ").append(getWebhook());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWebhookResult == false)
            return false;
        GetWebhookResult other = (GetWebhookResult) obj;
        if (other.getWebhook() == null ^ this.getWebhook() == null)
            return false;
        if (other.getWebhook() != null && other.getWebhook().equals(this.getWebhook()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebhook() == null) ? 0 : getWebhook().hashCode());
        return hashCode;
    }

    @Override
    public GetWebhookResult clone() {
        try {
            return (GetWebhookResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
