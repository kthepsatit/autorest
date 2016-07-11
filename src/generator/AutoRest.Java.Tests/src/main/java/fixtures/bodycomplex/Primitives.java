/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodycomplex.models.BooleanWrapper;
import fixtures.bodycomplex.models.ByteWrapper;
import fixtures.bodycomplex.models.Datetimerfc1123Wrapper;
import fixtures.bodycomplex.models.DatetimeWrapper;
import fixtures.bodycomplex.models.DateWrapper;
import fixtures.bodycomplex.models.DoubleWrapper;
import fixtures.bodycomplex.models.DurationWrapper;
import fixtures.bodycomplex.models.ErrorException;
import fixtures.bodycomplex.models.FloatWrapper;
import fixtures.bodycomplex.models.IntWrapper;
import fixtures.bodycomplex.models.LongWrapper;
import fixtures.bodycomplex.models.StringWrapper;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in Primitives.
 */
public interface Primitives {
    /**
     * Get complex types with integer properties.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the IntWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<IntWrapper> getInt() throws ErrorException, IOException;

    /**
     * Get complex types with integer properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getIntAsync(final ServiceCallback<IntWrapper> serviceCallback) throws IllegalArgumentException;

    /**
     * Put complex types with integer properties.
     *
     * @param complexBody Please put -1 and 2
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putInt(IntWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with integer properties.
     *
     * @param complexBody Please put -1 and 2
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putIntAsync(IntWrapper complexBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get complex types with long properties.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the LongWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<LongWrapper> getLong() throws ErrorException, IOException;

    /**
     * Get complex types with long properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getLongAsync(final ServiceCallback<LongWrapper> serviceCallback) throws IllegalArgumentException;

    /**
     * Put complex types with long properties.
     *
     * @param complexBody Please put 1099511627775 and -999511627788
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putLong(LongWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with long properties.
     *
     * @param complexBody Please put 1099511627775 and -999511627788
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putLongAsync(LongWrapper complexBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get complex types with float properties.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the FloatWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FloatWrapper> getFloat() throws ErrorException, IOException;

    /**
     * Get complex types with float properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getFloatAsync(final ServiceCallback<FloatWrapper> serviceCallback) throws IllegalArgumentException;

    /**
     * Put complex types with float properties.
     *
     * @param complexBody Please put 1.05 and -0.003
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putFloat(FloatWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with float properties.
     *
     * @param complexBody Please put 1.05 and -0.003
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putFloatAsync(FloatWrapper complexBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get complex types with double properties.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DoubleWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DoubleWrapper> getDouble() throws ErrorException, IOException;

    /**
     * Get complex types with double properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDoubleAsync(final ServiceCallback<DoubleWrapper> serviceCallback) throws IllegalArgumentException;

    /**
     * Put complex types with double properties.
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putDouble(DoubleWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with double properties.
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putDoubleAsync(DoubleWrapper complexBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get complex types with bool properties.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BooleanWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BooleanWrapper> getBool() throws ErrorException, IOException;

    /**
     * Get complex types with bool properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getBoolAsync(final ServiceCallback<BooleanWrapper> serviceCallback) throws IllegalArgumentException;

    /**
     * Put complex types with bool properties.
     *
     * @param complexBody Please put true and false
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBool(BooleanWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with bool properties.
     *
     * @param complexBody Please put true and false
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putBoolAsync(BooleanWrapper complexBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get complex types with string properties.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the StringWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<StringWrapper> getString() throws ErrorException, IOException;

    /**
     * Get complex types with string properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getStringAsync(final ServiceCallback<StringWrapper> serviceCallback) throws IllegalArgumentException;

    /**
     * Put complex types with string properties.
     *
     * @param complexBody Please put 'goodrequest', '', and null
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putString(StringWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with string properties.
     *
     * @param complexBody Please put 'goodrequest', '', and null
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putStringAsync(StringWrapper complexBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get complex types with date properties.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DateWrapper> getDate() throws ErrorException, IOException;

    /**
     * Get complex types with date properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDateAsync(final ServiceCallback<DateWrapper> serviceCallback) throws IllegalArgumentException;

    /**
     * Put complex types with date properties.
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putDate(DateWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with date properties.
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putDateAsync(DateWrapper complexBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get complex types with datetime properties.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DatetimeWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DatetimeWrapper> getDateTime() throws ErrorException, IOException;

    /**
     * Get complex types with datetime properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDateTimeAsync(final ServiceCallback<DatetimeWrapper> serviceCallback) throws IllegalArgumentException;

    /**
     * Put complex types with datetime properties.
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putDateTime(DatetimeWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with datetime properties.
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putDateTimeAsync(DatetimeWrapper complexBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Datetimerfc1123Wrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Datetimerfc1123Wrapper> getDateTimeRfc1123() throws ErrorException, IOException;

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDateTimeRfc1123Async(final ServiceCallback<Datetimerfc1123Wrapper> serviceCallback) throws IllegalArgumentException;

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putDateTimeRfc1123(Datetimerfc1123Wrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putDateTimeRfc1123Async(Datetimerfc1123Wrapper complexBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get complex types with duration properties.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DurationWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DurationWrapper> getDuration() throws ErrorException, IOException;

    /**
     * Get complex types with duration properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDurationAsync(final ServiceCallback<DurationWrapper> serviceCallback) throws IllegalArgumentException;

    /**
     * Put complex types with duration properties.
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putDuration(DurationWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with duration properties.
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putDurationAsync(DurationWrapper complexBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get complex types with byte properties.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ByteWrapper object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ByteWrapper> getByte() throws ErrorException, IOException;

    /**
     * Get complex types with byte properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getByteAsync(final ServiceCallback<ByteWrapper> serviceCallback) throws IllegalArgumentException;

    /**
     * Put complex types with byte properties.
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6)
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putByte(ByteWrapper complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types with byte properties.
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putByteAsync(ByteWrapper complexBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

}