/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ecs.AmazonECS#listTaskDefinitions(ListTaskDefinitionsRequest) ListTaskDefinitions operation}.
 * <p>
 * Returns a list of task definitions that are registered to your
 * account. You can filter the results by family name with the
 * <code>familyPrefix</code> parameter.
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#listTaskDefinitions(ListTaskDefinitionsRequest)
 */
public class ListTaskDefinitionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The full family name that you want to filter the
     * <code>ListTaskDefinitions</code> results with. Specifying a
     * <code>familyPrefix</code> will limit the listed task definitions to
     * task definition revisions that belong to that family.
     */
    private String familyPrefix;

    /**
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListTaskDefinitions</code> request where <code>maxResults</code>
     * was used and the results exceeded the value of that parameter.
     * Pagination continues from the end of the previous results that
     * returned the <code>nextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     */
    private String nextToken;

    /**
     * The maximum number of task definition results returned by
     * <code>ListTaskDefinitions</code> in paginated output. When this
     * parameter is used, <code>ListTaskDefinitions</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListTaskDefinitions</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTaskDefinitions</code>
     * returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     */
    private Integer maxResults;

    /**
     * The full family name that you want to filter the
     * <code>ListTaskDefinitions</code> results with. Specifying a
     * <code>familyPrefix</code> will limit the listed task definitions to
     * task definition revisions that belong to that family.
     *
     * @return The full family name that you want to filter the
     *         <code>ListTaskDefinitions</code> results with. Specifying a
     *         <code>familyPrefix</code> will limit the listed task definitions to
     *         task definition revisions that belong to that family.
     */
    public String getFamilyPrefix() {
        return familyPrefix;
    }
    
    /**
     * The full family name that you want to filter the
     * <code>ListTaskDefinitions</code> results with. Specifying a
     * <code>familyPrefix</code> will limit the listed task definitions to
     * task definition revisions that belong to that family.
     *
     * @param familyPrefix The full family name that you want to filter the
     *         <code>ListTaskDefinitions</code> results with. Specifying a
     *         <code>familyPrefix</code> will limit the listed task definitions to
     *         task definition revisions that belong to that family.
     */
    public void setFamilyPrefix(String familyPrefix) {
        this.familyPrefix = familyPrefix;
    }
    
    /**
     * The full family name that you want to filter the
     * <code>ListTaskDefinitions</code> results with. Specifying a
     * <code>familyPrefix</code> will limit the listed task definitions to
     * task definition revisions that belong to that family.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param familyPrefix The full family name that you want to filter the
     *         <code>ListTaskDefinitions</code> results with. Specifying a
     *         <code>familyPrefix</code> will limit the listed task definitions to
     *         task definition revisions that belong to that family.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTaskDefinitionsRequest withFamilyPrefix(String familyPrefix) {
        this.familyPrefix = familyPrefix;
        return this;
    }

    /**
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListTaskDefinitions</code> request where <code>maxResults</code>
     * was used and the results exceeded the value of that parameter.
     * Pagination continues from the end of the previous results that
     * returned the <code>nextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @return The <code>nextToken</code> value returned from a previous paginated
     *         <code>ListTaskDefinitions</code> request where <code>maxResults</code>
     *         was used and the results exceeded the value of that parameter.
     *         Pagination continues from the end of the previous results that
     *         returned the <code>nextToken</code> value. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListTaskDefinitions</code> request where <code>maxResults</code>
     * was used and the results exceeded the value of that parameter.
     * Pagination continues from the end of the previous results that
     * returned the <code>nextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @param nextToken The <code>nextToken</code> value returned from a previous paginated
     *         <code>ListTaskDefinitions</code> request where <code>maxResults</code>
     *         was used and the results exceeded the value of that parameter.
     *         Pagination continues from the end of the previous results that
     *         returned the <code>nextToken</code> value. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListTaskDefinitions</code> request where <code>maxResults</code>
     * was used and the results exceeded the value of that parameter.
     * Pagination continues from the end of the previous results that
     * returned the <code>nextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The <code>nextToken</code> value returned from a previous paginated
     *         <code>ListTaskDefinitions</code> request where <code>maxResults</code>
     *         was used and the results exceeded the value of that parameter.
     *         Pagination continues from the end of the previous results that
     *         returned the <code>nextToken</code> value. This value is
     *         <code>null</code> when there are no more results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTaskDefinitionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of task definition results returned by
     * <code>ListTaskDefinitions</code> in paginated output. When this
     * parameter is used, <code>ListTaskDefinitions</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListTaskDefinitions</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTaskDefinitions</code>
     * returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     *
     * @return The maximum number of task definition results returned by
     *         <code>ListTaskDefinitions</code> in paginated output. When this
     *         parameter is used, <code>ListTaskDefinitions</code> only returns
     *         <code>maxResults</code> results in a single page along with a
     *         <code>nextToken</code> response element. The remaining results of the
     *         initial request can be seen by sending another
     *         <code>ListTaskDefinitions</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If
     *         this parameter is not used, then <code>ListTaskDefinitions</code>
     *         returns up to 100 results and a <code>nextToken</code> value if
     *         applicable.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of task definition results returned by
     * <code>ListTaskDefinitions</code> in paginated output. When this
     * parameter is used, <code>ListTaskDefinitions</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListTaskDefinitions</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTaskDefinitions</code>
     * returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     *
     * @param maxResults The maximum number of task definition results returned by
     *         <code>ListTaskDefinitions</code> in paginated output. When this
     *         parameter is used, <code>ListTaskDefinitions</code> only returns
     *         <code>maxResults</code> results in a single page along with a
     *         <code>nextToken</code> response element. The remaining results of the
     *         initial request can be seen by sending another
     *         <code>ListTaskDefinitions</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If
     *         this parameter is not used, then <code>ListTaskDefinitions</code>
     *         returns up to 100 results and a <code>nextToken</code> value if
     *         applicable.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of task definition results returned by
     * <code>ListTaskDefinitions</code> in paginated output. When this
     * parameter is used, <code>ListTaskDefinitions</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListTaskDefinitions</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTaskDefinitions</code>
     * returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of task definition results returned by
     *         <code>ListTaskDefinitions</code> in paginated output. When this
     *         parameter is used, <code>ListTaskDefinitions</code> only returns
     *         <code>maxResults</code> results in a single page along with a
     *         <code>nextToken</code> response element. The remaining results of the
     *         initial request can be seen by sending another
     *         <code>ListTaskDefinitions</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If
     *         this parameter is not used, then <code>ListTaskDefinitions</code>
     *         returns up to 100 results and a <code>nextToken</code> value if
     *         applicable.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTaskDefinitionsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFamilyPrefix() != null) sb.append("FamilyPrefix: " + getFamilyPrefix() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFamilyPrefix() == null) ? 0 : getFamilyPrefix().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTaskDefinitionsRequest == false) return false;
        ListTaskDefinitionsRequest other = (ListTaskDefinitionsRequest)obj;
        
        if (other.getFamilyPrefix() == null ^ this.getFamilyPrefix() == null) return false;
        if (other.getFamilyPrefix() != null && other.getFamilyPrefix().equals(this.getFamilyPrefix()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        return true;
    }
    
    @Override
    public ListTaskDefinitionsRequest clone() {
        
            return (ListTaskDefinitionsRequest) super.clone();
    }

}
    