

# EmploymentRecord

Emploment record response payload

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier created by Belvo for the current IMSS statement. |  [optional] |
|**link** | **UUID** | The unique identifier created by Belvo for the current user. |  [optional] |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was initially created in Belvo&#39;s database. |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  [optional] |
|**reportDate** | **LocalDate** | The date when the employment record report was generated, in &#x60;YYYY-MM-DD&#x60; format. |  [optional] |
|**internalIdentification** | **String** | Unique ID for user according to the institution. For IMSS Mexico, this is the CURP. |  [optional] |
|**personalData** | [**EmploymentRecordPersonalData**](EmploymentRecordPersonalData.md) |  |  [optional] |
|**socialSecuritySummary** | [**EmploymentRecordSocialSecuritySummary**](EmploymentRecordSocialSecuritySummary.md) |  |  [optional] |
|**employmentRecords** | [**List&lt;EmploymentRecordDetail&gt;**](EmploymentRecordDetail.md) | Details regarding the individual&#39;s employment history. |  [optional] |
|**files** | [**List&lt;EmploymentRecordFile&gt;**](EmploymentRecordFile.md) | Additional PDF binary files relating to the individual&#39;s employment. |  [optional] |



