# belvo_client.model.invoices_payments_dian.InvoicesPaymentsDian

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**date** | None, str, datetime,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | value must conform to RFC-3339 date-time
**[related_documents](#related_documents)** | list, tuple,  | tuple,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 
**amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | value must be a 32 bit float
**payment_type** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 
**exchange_rate** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 
**payer_account_number** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 
**payer_rfc** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 
**currency** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 
**beneficiary_account_number** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 
**operation_number** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 
**payer_bank_name** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 
**beneficiary_rfc** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# related_documents

**Note**: This field is not applicable for DIAN Colombia and will return `null`. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InvoicesPaymentsRelatedDocumentsDian**](InvoicesPaymentsRelatedDocumentsDian.md) | [**InvoicesPaymentsRelatedDocumentsDian**](InvoicesPaymentsRelatedDocumentsDian.md) | [**InvoicesPaymentsRelatedDocumentsDian**](InvoicesPaymentsRelatedDocumentsDian.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

