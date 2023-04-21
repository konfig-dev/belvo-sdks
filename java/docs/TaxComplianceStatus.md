

# TaxComplianceStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier created by Belvo used to reference the current Tax Compliance Status. |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  [optional] |
|**internalIdentification** | **String** | The institution’s internal identification number for the document. |  [optional] |
|**pdf** | **File** | Tax compliance status PDF as a binary. |  |
|**rfc** | **String** | The account holder&#39;s RFC (Registro Federal de Contribuyentes) number. |  [optional] |
|**outcome** | **EnumTaxComplianceStatusOutcome** |  |  [optional] |



