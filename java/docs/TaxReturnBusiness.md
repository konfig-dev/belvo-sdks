

# TaxReturnBusiness


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier created by Belvo used to reference the current Tax Return. |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  [optional] |
|**informacionGeneral** | **Object** | General information regarding the tax return (year, RFC, return type, person/company name, and so on). |  |
|**datosAdicionales** | **Object** | Additional data regarding the tax return. |  [optional] |
|**estadoResultados** | **Object** | Detailed information about the legal entity&#39;s yearly profit and loss. |  |
|**estadoPosicionFinancieraBalance** | **Object** | Details regarding balance sheet of the legal entity. |  |
|**conciliacionEntreResultadoContableFiscal** | **Object** | Details regarding the accounting reconciliation. |  |
|**deduccionesAutorizadas** | **Object** | Details regarding the legal entity&#39;s deductions. |  [optional] |
|**cifrasCierreEjercicio** | **Object** | Details regarding key numbers at the end of the fiscal exercise. |  |
|**determinacionDelImpuestoSobreLaRenta** | **Object** | Details regarding the final tax return. |  |
|**dividendosOUtilidadesDistribuidos** | **Object** | Details regarding distributed dividends. |  [optional] |
|**detallePagoR1IsrPersonasMorales** | **Object** | Details of the tax payment. |  |
|**pdf** | **File** | Tax return PDF as a binary. |  |
|**receiptPdf** | **File** | The acknowledgement receipt from the fiscal institution confirming that they received the tax return. |  |



