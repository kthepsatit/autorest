/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.url;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PathItems.
 */
public interface PathItems {
    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     */
    void getAllWithValues(String localStringPath, String pathItemStringPath);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getAllWithValuesAsync(String localStringPath, String pathItemStringPath, final ServiceCallback<Void> serviceCallback);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getAllWithValuesAsync(String localStringPath, String pathItemStringPath);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getAllWithValuesWithServiceResponseAsync(String localStringPath, String pathItemStringPath);
    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     */
    void getAllWithValues(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getAllWithValuesAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getAllWithValuesAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getAllWithValuesWithServiceResponseAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     */
    void getGlobalQueryNull(String localStringPath, String pathItemStringPath);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getGlobalQueryNullAsync(String localStringPath, String pathItemStringPath, final ServiceCallback<Void> serviceCallback);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getGlobalQueryNullAsync(String localStringPath, String pathItemStringPath);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getGlobalQueryNullWithServiceResponseAsync(String localStringPath, String pathItemStringPath);
    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     */
    void getGlobalQueryNull(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getGlobalQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getGlobalQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery='localStringQuery'.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value 'localStringQuery'
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getGlobalQueryNullWithServiceResponseAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     */
    void getGlobalAndLocalQueryNull(String localStringPath, String pathItemStringPath);

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getGlobalAndLocalQueryNullAsync(String localStringPath, String pathItemStringPath, final ServiceCallback<Void> serviceCallback);

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getGlobalAndLocalQueryNullAsync(String localStringPath, String pathItemStringPath);

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getGlobalAndLocalQueryNullWithServiceResponseAsync(String localStringPath, String pathItemStringPath);
    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain null value
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     */
    void getGlobalAndLocalQueryNull(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain null value
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getGlobalAndLocalQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain null value
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getGlobalAndLocalQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);

    /**
     * send globalStringPath=globalStringPath, pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery=null, pathItemStringQuery='pathItemStringQuery', localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain null value
     * @param pathItemStringQuery A string value 'pathItemStringQuery' that appears as a query parameter
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getGlobalAndLocalQueryNullWithServiceResponseAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     */
    void getLocalPathItemQueryNull(String localStringPath, String pathItemStringPath);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getLocalPathItemQueryNullAsync(String localStringPath, String pathItemStringPath, final ServiceCallback<Void> serviceCallback);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getLocalPathItemQueryNullAsync(String localStringPath, String pathItemStringPath);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getLocalPathItemQueryNullWithServiceResponseAsync(String localStringPath, String pathItemStringPath);
    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value null
     * @param pathItemStringQuery should contain value null
     */
    void getLocalPathItemQueryNull(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value null
     * @param pathItemStringQuery should contain value null
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getLocalPathItemQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value null
     * @param pathItemStringQuery should contain value null
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getLocalPathItemQueryNullAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);

    /**
     * send globalStringPath='globalStringPath', pathItemStringPath='pathItemStringPath', localStringPath='localStringPath', globalStringQuery='globalStringQuery', pathItemStringQuery=null, localStringQuery=null.
     *
     * @param localStringPath should contain value 'localStringPath'
     * @param pathItemStringPath A string value 'pathItemStringPath' that appears in the path
     * @param localStringQuery should contain value null
     * @param pathItemStringQuery should contain value null
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getLocalPathItemQueryNullWithServiceResponseAsync(String localStringPath, String pathItemStringPath, String localStringQuery, String pathItemStringQuery);

}
