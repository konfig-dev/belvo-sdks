# belvo_client.model.accounts_complete_request400_response.AccountsCompleteRequest400Response

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
#### anyOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[TooManySessionsError](TooManySessionsError.md) | [**TooManySessionsError**](TooManySessionsError.md) | [**TooManySessionsError**](TooManySessionsError.md) |  | 
[SessionExpiredError](SessionExpiredError.md) | [**SessionExpiredError**](SessionExpiredError.md) | [**SessionExpiredError**](SessionExpiredError.md) |  | 
[ValidationError](ValidationError.md) | [**ValidationError**](ValidationError.md) | [**ValidationError**](ValidationError.md) |  | 
[InstitutionDownError](InstitutionDownError.md) | [**InstitutionDownError**](InstitutionDownError.md) | [**InstitutionDownError**](InstitutionDownError.md) |  | 
[InstitutionUnavailableError](InstitutionUnavailableError.md) | [**InstitutionUnavailableError**](InstitutionUnavailableError.md) | [**InstitutionUnavailableError**](InstitutionUnavailableError.md) |  | 
[InstitutionInactiveError](InstitutionInactiveError.md) | [**InstitutionInactiveError**](InstitutionInactiveError.md) | [**InstitutionInactiveError**](InstitutionInactiveError.md) |  | 
[UnsupportedOperationError](UnsupportedOperationError.md) | [**UnsupportedOperationError**](UnsupportedOperationError.md) | [**UnsupportedOperationError**](UnsupportedOperationError.md) |  | 
[InvalidLinkError](InvalidLinkError.md) | [**InvalidLinkError**](InvalidLinkError.md) | [**InvalidLinkError**](InvalidLinkError.md) |  | 
[UnconfirmedLinkError](UnconfirmedLinkError.md) | [**UnconfirmedLinkError**](UnconfirmedLinkError.md) | [**UnconfirmedLinkError**](UnconfirmedLinkError.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

