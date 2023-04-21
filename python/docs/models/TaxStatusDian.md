# belvo_client.model.tax_status_dian.TaxStatusDian

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**official_name** | None, str,  | NoneClass, str,  | The name of the business.  Note: For individuals in Colombia, this field will return &#x60;null&#x60;.  | 
**address** | [**TaxStatusAddressDian**](TaxStatusAddressDian.md) | [**TaxStatusAddressDian**](TaxStatusAddressDian.md) |  | 
**id_cif** | None, str,  | NoneClass, str,  | The taxpayer&#x27;s *Cédula de ciudadanía* (CC) ID. Only applicable for individuals.  | 
**tax_payer_information** | [**TaxStatusTaxPayerInformationDian**](TaxStatusTaxPayerInformationDian.md) | [**TaxStatusTaxPayerInformationDian**](TaxStatusTaxPayerInformationDian.md) |  | 
**link** | str, uuid.UUID,  | str,  | The &#x60;link.id&#x60; that the tax status is associated with. | value must be a uuid
**[obligations](#obligations)** | list, tuple, None,  | tuple, NoneClass,  | Details regarding a business&#x27;s obligations.  ℹ️ For non-business accounts, this field will return empty.  | 
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | value must conform to RFC-3339 date-time
**[economic_activity](#economic_activity)** | list, tuple, None,  | tuple, NoneClass,  | A list of economic activity objects.  | 
**place_and_date_of_issuance** | None, str,  | NoneClass, str,  | The date when the tax status was issued. For example, &#x60;2020-08-05/18:55:16&#x60;. | 
**collected_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp when the data point was collected. | value must conform to RFC-3339 date-time
**pdf** | None, bytes, io.FileIO, io.BufferedReader,  | NoneClass, bytes, FileIO,  | Tax status PDF as a binary string. | 
**digital_stamp** | None, str,  | NoneClass, str,  | The validation certificate of the document. | 
**digital_stamp_chain** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 
**id** | str, uuid.UUID,  | str,  | Unique identifier created by Belvo used to reference the current Tax Status. | value must be a uuid
**regimen** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 
**[regimens](#regimens)** | list, tuple, None,  | tuple, NoneClass,  | A list of regimen objects.  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# economic_activity

A list of economic activity objects. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | A list of economic activity objects.  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**TaxStatusEconomicActivityDian**](TaxStatusEconomicActivityDian.md) | [**TaxStatusEconomicActivityDian**](TaxStatusEconomicActivityDian.md) | [**TaxStatusEconomicActivityDian**](TaxStatusEconomicActivityDian.md) |  | 

# obligations

Details regarding a business's obligations.  ℹ️ For non-business accounts, this field will return empty. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | Details regarding a business&#x27;s obligations.  ℹ️ For non-business accounts, this field will return empty.  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**TaxStatusObligationsDian**](TaxStatusObligationsDian.md) | [**TaxStatusObligationsDian**](TaxStatusObligationsDian.md) | [**TaxStatusObligationsDian**](TaxStatusObligationsDian.md) |  | 

# regimens

A list of regimen objects. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | A list of regimen objects.  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**TaxStatusRegimensDian**](TaxStatusRegimensDian.md) | [**TaxStatusRegimensDian**](TaxStatusRegimensDian.md) | [**TaxStatusRegimensDian**](TaxStatusRegimensDian.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

