# belvo_client.model.tax_returns_retrieve201_response.TaxReturnsRetrieve201Response

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#items) | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# items

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[TaxReturnPersonal](TaxReturnPersonal.md) | [**TaxReturnPersonal**](TaxReturnPersonal.md) | [**TaxReturnPersonal**](TaxReturnPersonal.md) |  | 
[TaxReturnPersonalMonthly](TaxReturnPersonalMonthly.md) | [**TaxReturnPersonalMonthly**](TaxReturnPersonalMonthly.md) | [**TaxReturnPersonalMonthly**](TaxReturnPersonalMonthly.md) |  | 
[TaxReturnBusiness](TaxReturnBusiness.md) | [**TaxReturnBusiness**](TaxReturnBusiness.md) | [**TaxReturnBusiness**](TaxReturnBusiness.md) |  | 
[TaxReturnBusinessMonthly](TaxReturnBusinessMonthly.md) | [**TaxReturnBusinessMonthly**](TaxReturnBusinessMonthly.md) | [**TaxReturnBusinessMonthly**](TaxReturnBusinessMonthly.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

