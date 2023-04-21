# belvo_client.model.owner.Owner

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**address** | None, str,  | NoneClass, str,  | The accounts owners registered address. | 
**internal_identification** | None, str,  | NoneClass, str,  | The institution&#x27;s internal identifier for the owner. | 
**phone_number** | None, str,  | NoneClass, str,  | The account owner&#x27;s registered phone number. | 
**display_name** | None, str,  | NoneClass, str,  | The full name of the owner, as provided by the bank. | 
**email** | None, str,  | NoneClass, str,  | The account owner&#x27;s registered email address. | 
**collected_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp when the data point was collected. | value must conform to RFC-3339 date-time
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique identifier used to reference the current owner. | [optional] value must be a uuid
**link** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the current Link. | [optional] value must be a uuid
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | [optional] value must conform to RFC-3339 date-time
**document_id** | [**OwnerDocumentId**](OwnerDocumentId.md) | [**OwnerDocumentId**](OwnerDocumentId.md) |  | [optional] 
**last_name** | None, str,  | NoneClass, str,  | *This field has been deprecated.*  *The last name of the account owner.*  | [optional] 
**second_last_name** | None, str,  | NoneClass, str,  | *This field has been deprecated.*  *The second last name of the account owner.*  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

