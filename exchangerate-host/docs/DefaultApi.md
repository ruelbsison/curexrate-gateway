# DefaultApi

All URIs are relative to *https://api.exchangerate.host*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDate**](DefaultApi.md#getDate) | **GET** /{date} | Your GET endpoint
[**getLatest**](DefaultApi.md#getLatest) | **GET** /latest | Your GET endpoint
[**getSymbols**](DefaultApi.md#getSymbols) | **GET** /symbols | Your GET endpoint


<a name="getDate"></a>
# **getDate**
> InlineResponse200 getDate(date, base, symbols, amount, paramCallback, places, format, source)

Your GET endpoint

Historical rates are available for most currencies all the way back to the year of 1999. You can query the API for historical rates by appending a date (format YYYY-MM-DD) to the base URL.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.exchangerate.host");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    LocalDate date = LocalDate.parse("Sat Apr 04 08:00:00 PST 2020"); // LocalDate | (format YYYY-MM-DD)
    String base = "base_example"; // String | Changing base currency. Enter the three-letter currency code of your preferred base currency.
    String symbols = "symbols_example"; // String | Enter a list of comma-separated currency codes to limit output currencies.
    String amount = "amount_example"; // String | The amount to be converted.
    String paramCallback = "paramCallback_example"; // String | API comes with support for JSONP Callbacks. This feature enables you to specify a function name, pass it into the API's callback GET parameter and cause the API to return your requested API response wrapped inside that function.
    String places = "places_example"; // String | Round numbers to decimal place.
    String format = "format_example"; // String | If respone success, then you can format output to XML, CSV or TSV.
    String source = "source_example"; // String |  You can switch source data between (default) forex, bank view or crypto currencies.
    try {
      InlineResponse200 result = apiInstance.getDate(date, base, symbols, amount, paramCallback, places, format, source);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getDate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **LocalDate**| (format YYYY-MM-DD) |
 **base** | **String**| Changing base currency. Enter the three-letter currency code of your preferred base currency. | [optional]
 **symbols** | **String**| Enter a list of comma-separated currency codes to limit output currencies. | [optional]
 **amount** | **String**| The amount to be converted. | [optional]
 **paramCallback** | **String**| API comes with support for JSONP Callbacks. This feature enables you to specify a function name, pass it into the API&#39;s callback GET parameter and cause the API to return your requested API response wrapped inside that function. | [optional]
 **places** | **String**| Round numbers to decimal place. | [optional]
 **format** | **String**| If respone success, then you can format output to XML, CSV or TSV. | [optional]
 **source** | **String**|  You can switch source data between (default) forex, bank view or crypto currencies. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getLatest"></a>
# **getLatest**
> InlineResponse200 getLatest(base, symbols, amount, paramCallback, places, format, source)

Your GET endpoint

Get the latest foreign exchange reference rates. Latest endpoint will return exchange rate data updated on daily basis.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.exchangerate.host");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String base = "base_example"; // String | Changing base currency. Enter the three-letter currency code of your preferred base currency.
    String symbols = "symbols_example"; // String | Enter a list of comma-separated currency codes to limit output currencies.
    String amount = "amount_example"; // String | The amount to be converted.
    String paramCallback = "paramCallback_example"; // String | API comes with support for JSONP Callbacks. This feature enables you to specify a function name, pass it into the API's callback GET parameter and cause the API to return your requested API response wrapped inside that function.
    String places = "places_example"; // String | Round numbers to decimal place.
    String format = "format_example"; // String | If respone success, then you can format output to XML, CSV or TSV.
    String source = "source_example"; // String |  You can switch source data between (default) forex, bank view or crypto currencies.
    try {
      InlineResponse200 result = apiInstance.getLatest(base, symbols, amount, paramCallback, places, format, source);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getLatest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **base** | **String**| Changing base currency. Enter the three-letter currency code of your preferred base currency. | [optional]
 **symbols** | **String**| Enter a list of comma-separated currency codes to limit output currencies. | [optional]
 **amount** | **String**| The amount to be converted. | [optional]
 **paramCallback** | **String**| API comes with support for JSONP Callbacks. This feature enables you to specify a function name, pass it into the API&#39;s callback GET parameter and cause the API to return your requested API response wrapped inside that function. | [optional]
 **places** | **String**| Round numbers to decimal place. | [optional]
 **format** | **String**| If respone success, then you can format output to XML, CSV or TSV. | [optional]
 **source** | **String**|  You can switch source data between (default) forex, bank view or crypto currencies. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getSymbols"></a>
# **getSymbols**
> InlineResponse2001 getSymbols(paramCallback, format)

Your GET endpoint

API comes with a constantly updated endpoint returning all available currencies. To access this list, make a request to the API&#39;s symbols endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.exchangerate.host");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String paramCallback = "paramCallback_example"; // String | API comes with support for JSONP Callbacks. This feature enables you to specify a function name, pass it into the API's callback GET parameter and cause the API to return your requested API response wrapped inside that function.
    String format = "format_example"; // String |  If respone success, then you can format output to XML, CSV or TSV.
    try {
      InlineResponse2001 result = apiInstance.getSymbols(paramCallback, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getSymbols");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paramCallback** | **String**| API comes with support for JSONP Callbacks. This feature enables you to specify a function name, pass it into the API&#39;s callback GET parameter and cause the API to return your requested API response wrapped inside that function. | [optional]
 **format** | **String**|  If respone success, then you can format output to XML, CSV or TSV. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

