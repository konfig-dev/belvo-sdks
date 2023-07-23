# IncomeVerificationApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verify**](IncomeVerificationApi.md#verify) | **POST** /api/enrich/incomes | Verify incomes


# **verify**

#### **POST** /api/enrich/incomes

### Description
Send through your raw data and receive enriched information for each of your user's income streams.

<div style="background-color:#f4f6f8; border-left: 6px solid #5bc0de;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px">
<strong>Note: </strong> Belvo can process up to 10,000 unique transactions per request.
</div>

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const verifyResponse = await belvo.incomeVerification.verify({
  language: "pt",
  transactions: [
    {
      description: "SALÁRIO MENSAL",
      transaction_id: "3CWE4927CF15355",
      account_holder_type: "INDIVIDUAL",
      account_holder_id: "a61bc801-9fa5-457b-88ad-850c96eaca30",
      account_id: "EBACA-89077589",
      account_category: "CHECKING_ACCOUNT",
      value_date: "2022-11-18",
      type: "INFLOW",
      amount: 650.89,
      currency: "BRL",
      institution: "Erebor Brazil",
    },
  ],
  date_from: "2022-08-01",
  date_to: "2022-12-30",
  minimum_confidence_level: "HIGH",
});

console.log(verifyResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eyodIncomeVerificationRequest** | **EyodIncomeVerificationRequest**|  |


### Return type

**Array<Income>**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** | Bad request error |  -  |
**401** | Authentication to Belvo API failed |  -  |
**403** | Access to Belvo API denied |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


