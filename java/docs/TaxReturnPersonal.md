

# TaxReturnPersonal


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier created by Belvo used to reference the current Tax Return. |  [optional] |
|**link** | **UUID** | The &#x60;link.id&#x60; the statement belongs to |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  [optional] |
|**informacionGeneral** | **Object** | General information on the tax return (year, RFC, return type, person/company name, and so on). |  |
|**sueldosSalarios** | **Object** | Details regarding the income information together combined with withheld taxes. |  |
|**serviciosProfesionales** | **Object** | Details regarding the income and tax information from professional services provided. |  |
|**deduccionesPersonales** | **Object** | List of all personal tax deductions. |  |
|**determinacionImpuesto** | **Object** | Details regarding the final tax return. |  |
|**retenciones** | **Object** | Details on the already withheld taxes. |  |
|**dividendos** | **Object** | Details regarding dividends. |  |
|**datosInformativos** | **Object** | Extra informative data on the tax return. |  [optional] |
|**pdf** | **File** | Tax return PDF as a binary. |  |
|**receiptPdf** | **File** | The acknowledgement receipt from the fiscal institution confirming that they received the tax return. |  |



