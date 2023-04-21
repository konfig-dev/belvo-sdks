

# TaxDeclarationBusiness


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique ID for the current tax declaration. |  |
|**link** | **UUID** | Belvo&#39;s unique ID of the user that this tax declaration is associated with. |  |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  |
|**documentInformation** | [**DocumentInformationBusiness**](DocumentInformationBusiness.md) |  |  |
|**taxPayerInformation** | [**TaxPayerInformationBusiness**](TaxPayerInformationBusiness.md) |  |  |
|**equityStatement** | [**EquityStatementBusiness**](EquityStatementBusiness.md) |  |  |
|**annualIncomeStatement** | [**AnnualIncomeStatementBusiness**](AnnualIncomeStatementBusiness.md) |  |  |
|**annualCostsAndDeductionsStatement** | [**AnnualCostsAndDeductionsStatementBusiness**](AnnualCostsAndDeductionsStatementBusiness.md) |  |  |
|**taxAssessment** | [**TaxAssessmentBusiness**](TaxAssessmentBusiness.md) |  |  |
|**dateIssued** | **LocalDate** | The date the tax declaration was issued by the fiscal institution. |  |
|**pdf** | **String** | The PDF of the tax declaration, as a binary string. |  |



