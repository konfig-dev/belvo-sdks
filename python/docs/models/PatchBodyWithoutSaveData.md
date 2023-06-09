# belvo_client.model.patch_body_without_save_data.PatchBodyWithoutSaveData

A JSON object containing a session UUID and a MFA token

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | A JSON object containing a session UUID and a MFA token | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**session** | str,  | str,  | The session you want to resume. You need to use the &#x60;session&#x60; value that is provided in the 428 Token Required response that you receive after you make your POST request. | 
**link** | str, uuid.UUID,  | str,  | The &#x60;link.id&#x60; you want to resume. Must be the same &#x60;link.id&#x60; as the one you receive in the 428 Token Required response that contains the &#x60;session&#x60; ID. | value must be a uuid
**token** | str,  | str,  | The MFA token generated by the institution and required to continue a session. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

