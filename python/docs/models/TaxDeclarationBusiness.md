# belvo_client.model.tax_declaration_business.TaxDeclarationBusiness

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**pdf** | None, str,  | NoneClass, str,  | The PDF of the tax declaration, as a binary string. | 
**annual_income_statement** | [**AnnualIncomeStatementBusiness**](AnnualIncomeStatementBusiness.md) | [**AnnualIncomeStatementBusiness**](AnnualIncomeStatementBusiness.md) |  | 
**equity_statement** | [**EquityStatementBusiness**](EquityStatementBusiness.md) | [**EquityStatementBusiness**](EquityStatementBusiness.md) |  | 
**annual_costs_and_deductions_statement** | [**AnnualCostsAndDeductionsStatementBusiness**](AnnualCostsAndDeductionsStatementBusiness.md) | [**AnnualCostsAndDeductionsStatementBusiness**](AnnualCostsAndDeductionsStatementBusiness.md) |  | 
**date_issued** | str, date,  | str,  | The date the tax declaration was issued by the fiscal institution. | value must conform to RFC-3339 full-date YYYY-MM-DD
**document_information** | [**DocumentInformationBusiness**](DocumentInformationBusiness.md) | [**DocumentInformationBusiness**](DocumentInformationBusiness.md) |  | 
**tax_payer_information** | [**TaxPayerInformationBusiness**](TaxPayerInformationBusiness.md) | [**TaxPayerInformationBusiness**](TaxPayerInformationBusiness.md) |  | 
**link** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID of the user that this tax declaration is associated with. | value must be a uuid
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | value must conform to RFC-3339 date-time
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the current tax declaration. | value must be a uuid
**tax_assessment** | [**TaxAssessmentBusiness**](TaxAssessmentBusiness.md) | [**TaxAssessmentBusiness**](TaxAssessmentBusiness.md) |  | 
**collected_at** | str, datetime,  | str,  | The ISO-8601 timestamp when the data point was collected. | value must conform to RFC-3339 date-time
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

