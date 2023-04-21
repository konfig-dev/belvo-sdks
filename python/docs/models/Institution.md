# belvo_client.model.institution.Institution

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | decimal.Decimal, int,  | decimal.Decimal,  | The ID of the institution as designated by Belvo. | [optional] value must be a 32 bit integer
**name** | str,  | str,  | The name of the institution, as designated by Belvo. Please see our [Institutions](https://developers.belvo.com/docs/institution) DevPortal article for a detailed list of institution names. | [optional] 
**type** | [**EnumInstitutionType**](EnumInstitutionType.md) | [**EnumInstitutionType**](EnumInstitutionType.md) |  | [optional] 
**website** | None, str,  | NoneClass, str,  | The URL of the institution&#x27;s website. | [optional] 
**display_name** | str,  | str,  | The customer-facing name of the institution. | [optional] 
**[country_codes](#country_codes)** | list, tuple,  | tuple,  | The country codes where the institution is available, for example: - 🇧🇷 BR (Brazil) - 🇨🇴 CO (Colombia) - 🇲🇽 MX (Mexico)    | [optional] 
**primary_color** | str,  | str,  | The primary color on the institution&#x27;s website. | [optional] 
**logo** | None, str,  | NoneClass, str,  | The URL of the institution&#x27;s logo. | [optional] 
**icon_logo** | None, str,  | NoneClass, str,  | The URL of the institution&#x27;s icon logo. | [optional] 
**text_logo** | None, str,  | NoneClass, str,  | The URL of the institution&#x27;s text logo. | [optional] 
**[form_fields](#form_fields)** | list, tuple,  | tuple,  |  | [optional] 
**[features](#features)** | list, tuple,  | tuple,  | The features that the institution supports. If the institution has no special features, then Belvo returns an empty array.  Here is a list of the available features: - &#x60;token_required&#x60; indicates that the institution may require a token during link creation or when making any other requests.  | [optional] 
**[resources](#resources)** | list, tuple,  | tuple,  | A list of Belvo resources that you can use with the institution. This list includes one or more of the following resources:    - &#x60;ACCOUNTS&#x60;   - &#x60;BALANCES&#x60;   - &#x60;INCOMES&#x60;   - &#x60;INVESTMENTS_PORTFOLIOS&#x60; *This field has been deprecated.*   - &#x60;INVESTMENTS_TRANSACTIONS&#x60; *This field has been deprecated.*   - &#x60;INVOICES&#x60;   - &#x60;OWNERS&#x60;   - &#x60;RECURRING_EXPENSES&#x60;   - &#x60;RISK_INSIGHTS&#x60;   - &#x60;TRANSACTIONS&#x60;   - &#x60;TAX_COMPLIANCE_STATUS&#x60;   - &#x60;TAX_STATUS&#x60;   - &#x60;TAX_RETURNS&#x60;  | [optional] 
**integration_type** | [**EnumInstitutionIntegrationType**](EnumInstitutionIntegrationType.md) | [**EnumInstitutionIntegrationType**](EnumInstitutionIntegrationType.md) |  | [optional] 
**status** | [**EnumInstitutionStatus**](EnumInstitutionStatus.md) | [**EnumInstitutionStatus**](EnumInstitutionStatus.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# country_codes

The country codes where the institution is available, for example: - 🇧🇷 BR (Brazil) - 🇨🇴 CO (Colombia) - 🇲🇽 MX (Mexico)   

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | The country codes where the institution is available, for example: - 🇧🇷 BR (Brazil) - 🇨🇴 CO (Colombia) - 🇲🇽 MX (Mexico)    | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# form_fields

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InstitutionsFormField**](InstitutionsFormField.md) | [**InstitutionsFormField**](InstitutionsFormField.md) | [**InstitutionsFormField**](InstitutionsFormField.md) |  | 

# features

The features that the institution supports. If the institution has no special features, then Belvo returns an empty array.  Here is a list of the available features: - `token_required` indicates that the institution may require a token during link creation or when making any other requests. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | The features that the institution supports. If the institution has no special features, then Belvo returns an empty array.  Here is a list of the available features: - &#x60;token_required&#x60; indicates that the institution may require a token during link creation or when making any other requests.  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InstitutionsFeature**](InstitutionsFeature.md) | [**InstitutionsFeature**](InstitutionsFeature.md) | [**InstitutionsFeature**](InstitutionsFeature.md) |  | 

# resources

A list of Belvo resources that you can use with the institution. This list includes one or more of the following resources:    - `ACCOUNTS`   - `BALANCES`   - `INCOMES`   - `INVESTMENTS_PORTFOLIOS` *This field has been deprecated.*   - `INVESTMENTS_TRANSACTIONS` *This field has been deprecated.*   - `INVOICES`   - `OWNERS`   - `RECURRING_EXPENSES`   - `RISK_INSIGHTS`   - `TRANSACTIONS`   - `TAX_COMPLIANCE_STATUS`   - `TAX_STATUS`   - `TAX_RETURNS` 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | A list of Belvo resources that you can use with the institution. This list includes one or more of the following resources:    - &#x60;ACCOUNTS&#x60;   - &#x60;BALANCES&#x60;   - &#x60;INCOMES&#x60;   - &#x60;INVESTMENTS_PORTFOLIOS&#x60; *This field has been deprecated.*   - &#x60;INVESTMENTS_TRANSACTIONS&#x60; *This field has been deprecated.*   - &#x60;INVOICES&#x60;   - &#x60;OWNERS&#x60;   - &#x60;RECURRING_EXPENSES&#x60;   - &#x60;RISK_INSIGHTS&#x60;   - &#x60;TRANSACTIONS&#x60;   - &#x60;TAX_COMPLIANCE_STATUS&#x60;   - &#x60;TAX_STATUS&#x60;   - &#x60;TAX_RETURNS&#x60;  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  | A Belvo resource that the institution supports. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

