/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import retrofit.http.HEAD;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;
import retrofit.http.PATCH;
import retrofit.http.POST;
import com.microsoft.rest.DELETE;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpSuccess.
 */
public interface HttpSuccess {
    /**
     * The interface defining all the services for HttpSuccess to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HttpSuccessService {
        @HEAD("/http/success/200")
        Response head200() throws ServiceException;

        @HEAD("/http/success/200")
        void head200Async(ServiceResponseCallback cb);

        @GET("/http/success/200")
        Response get200() throws ServiceException;

        @GET("/http/success/200")
        void get200Async(ServiceResponseCallback cb);

        @PUT("/http/success/200")
        Response put200(@Body Boolean booleanValue) throws ServiceException;

        @PUT("/http/success/200")
        void put200Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @PATCH("/http/success/200")
        Response patch200(@Body Boolean booleanValue) throws ServiceException;

        @PATCH("/http/success/200")
        void patch200Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @POST("/http/success/200")
        Response post200(@Body Boolean booleanValue) throws ServiceException;

        @POST("/http/success/200")
        void post200Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @DELETE("/http/success/200")
        Response delete200(@Body Boolean booleanValue) throws ServiceException;

        @DELETE("/http/success/200")
        void delete200Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @PUT("/http/success/201")
        Response put201(@Body Boolean booleanValue) throws ServiceException;

        @PUT("/http/success/201")
        void put201Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @POST("/http/success/201")
        Response post201(@Body Boolean booleanValue) throws ServiceException;

        @POST("/http/success/201")
        void post201Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @PUT("/http/success/202")
        Response put202(@Body Boolean booleanValue) throws ServiceException;

        @PUT("/http/success/202")
        void put202Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @PATCH("/http/success/202")
        Response patch202(@Body Boolean booleanValue) throws ServiceException;

        @PATCH("/http/success/202")
        void patch202Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @POST("/http/success/202")
        Response post202(@Body Boolean booleanValue) throws ServiceException;

        @POST("/http/success/202")
        void post202Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @DELETE("/http/success/202")
        Response delete202(@Body Boolean booleanValue) throws ServiceException;

        @DELETE("/http/success/202")
        void delete202Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @HEAD("/http/success/204")
        Response head204() throws ServiceException;

        @HEAD("/http/success/204")
        void head204Async(ServiceResponseCallback cb);

        @PUT("/http/success/204")
        Response put204(@Body Boolean booleanValue) throws ServiceException;

        @PUT("/http/success/204")
        void put204Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @PATCH("/http/success/204")
        Response patch204(@Body Boolean booleanValue) throws ServiceException;

        @PATCH("/http/success/204")
        void patch204Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @POST("/http/success/204")
        Response post204(@Body Boolean booleanValue) throws ServiceException;

        @POST("/http/success/204")
        void post204Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @DELETE("/http/success/204")
        Response delete204(@Body Boolean booleanValue) throws ServiceException;

        @DELETE("/http/success/204")
        void delete204Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @HEAD("/http/success/404")
        Response head404() throws ServiceException;

        @HEAD("/http/success/404")
        void head404Async(ServiceResponseCallback cb);

    }
    /**
     * Return 200 status code if successful
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void head200() throws ServiceException;

    /**
     * Return 200 status code if successful
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void head200Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Get 200 success
     *
     * @return the Boolean object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Boolean get200() throws ServiceException;

    /**
     * Get 200 success
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void get200Async(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Put boolean value true returning 200 success
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void put200(Boolean booleanValue) throws ServiceException;

    /**
     * Put boolean value true returning 200 success
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void put200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Patch true Boolean value in request returning 200
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void patch200(Boolean booleanValue) throws ServiceException;

    /**
     * Patch true Boolean value in request returning 200
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void patch200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post bollean value true in request that returns a 200
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void post200(Boolean booleanValue) throws ServiceException;

    /**
     * Post bollean value true in request that returns a 200
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void post200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete simple boolean value true returns 200
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void delete200(Boolean booleanValue) throws ServiceException;

    /**
     * Delete simple boolean value true returns 200
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void delete200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Put true Boolean value in request returns 201
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void put201(Boolean booleanValue) throws ServiceException;

    /**
     * Put true Boolean value in request returns 201
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void put201Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post true Boolean value in request returns 201 (Created)
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void post201(Boolean booleanValue) throws ServiceException;

    /**
     * Post true Boolean value in request returns 201 (Created)
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void post201Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Put true Boolean value in request returns 202 (Accepted)
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void put202(Boolean booleanValue) throws ServiceException;

    /**
     * Put true Boolean value in request returns 202 (Accepted)
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void put202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Patch true Boolean value in request returns 202
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void patch202(Boolean booleanValue) throws ServiceException;

    /**
     * Patch true Boolean value in request returns 202
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void patch202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post true Boolean value in request returns 202 (Accepted)
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void post202(Boolean booleanValue) throws ServiceException;

    /**
     * Post true Boolean value in request returns 202 (Accepted)
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void post202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete true Boolean value in request returns 202 (accepted)
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void delete202(Boolean booleanValue) throws ServiceException;

    /**
     * Delete true Boolean value in request returns 202 (accepted)
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void delete202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Return 204 status code if successful
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void head204() throws ServiceException;

    /**
     * Return 204 status code if successful
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void head204Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Put true Boolean value in request returns 204 (no content)
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void put204(Boolean booleanValue) throws ServiceException;

    /**
     * Put true Boolean value in request returns 204 (no content)
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void put204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Patch true Boolean value in request returns 204 (no content)
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void patch204(Boolean booleanValue) throws ServiceException;

    /**
     * Patch true Boolean value in request returns 204 (no content)
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void patch204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post true Boolean value in request returns 204 (no content)
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void post204(Boolean booleanValue) throws ServiceException;

    /**
     * Post true Boolean value in request returns 204 (no content)
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void post204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete true Boolean value in request returns 204 (no content)
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void delete204(Boolean booleanValue) throws ServiceException;

    /**
     * Delete true Boolean value in request returns 204 (no content)
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void delete204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Return 404 status code
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void head404() throws ServiceException;

    /**
     * Return 404 status code
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void head404Async(final ServiceCallback<Void> serviceCallback);

}