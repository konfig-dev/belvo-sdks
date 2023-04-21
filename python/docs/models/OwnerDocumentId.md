# belvo_client.model.owner_document_id.OwnerDocumentId

Information regarding the identification document the owner provided to the bank.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Information regarding the identification document the owner provided to the bank. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**document_number** | None, str,  | NoneClass, str,  | The document&#x27;s identification number. | 
**document_type** | None, str,  | NoneClass, str,  | The type of document the owner provided to the institution to open the account. Common document types are:  🇧🇷 Brazil - &#x60;CPF&#x60; (*Cadastro de Pessoas Físicas*) - &#x60;CNPJ&#x60;(*Cadastro Nacional de Pessoas Jurídicas*)  🇨🇴 Colombia - &#x60;CC&#x60;(*Cédula de Ciudadanía*) - &#x60;NIT&#x60; (*Número de Identificación Tributaria*)  🇲🇽 Mexico - &#x60;CURP&#x60; (*Clave Única de Registro de Población*) - &#x60;NISS&#x60; (*Número de Seguridad Social*)  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

