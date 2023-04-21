

# LinksPutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**password** | **String** | The end-user&#39;s password used to log in to the institution. |  |
|**password2** | **String** | The end-user&#39;s second password used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second password, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the &#x60;form_fields&#x60; array in the response.  |  [optional] |
|**token** | **String** | The MFA token required by the bank to log in.  |  [optional] |
|**usernameType** | **String** | Type of document to be used as a username.    Some banking institutions accept different documents to be used as the &#x60;username&#x60; to login. For example, the *Cédula de Ciudadanía*, *Cédula de Extranjería*, *Pasaporte&#39;*, and so on.    For banks that require a document to log in, you **must** provide the &#x60;username_type&#x60; parameter to specify which document is used when creating the link.    ℹ️ To know which institutions require the &#x60;username_type&#x60; parameter, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the &#x60;form_fields&#x60; array in the response.    For a list of standards codes, see the table below.  | Code | Description | |-----------|-------| | &#x60;001&#x60; | Cédula de Ciudadanía | | &#x60;002&#x60; | Cédula de Extranjería | | &#x60;003&#x60; | Pasaporte | | &#x60;004&#x60; | Tarjeta de Identidad | | &#x60;005&#x60; | Registro Civil | | &#x60;006&#x60; | Número Identificación Personal | | &#x60;020&#x60; | NIT | | &#x60;021&#x60; | NIT Persona Natural | | &#x60;022&#x60; | NIT Persona Extranjera | | &#x60;023&#x60; | NIT Persona Jurídica | | &#x60;024&#x60; | NIT Menores | | &#x60;025&#x60; | NIT Desasociado | | &#x60;030&#x60; | Trj. Seguro Social Extranjero | | &#x60;031&#x60; | Sociedad Extranjera sin NIT en Colombia | | &#x60;032&#x60; | Fideicomiso | | &#x60;033&#x60; | RIF Venezuela | | &#x60;034&#x60; | CIF | | &#x60;035&#x60; | Número de Identidad | | &#x60;036&#x60; | RTN | | &#x60;037&#x60; | Cédula de Identidad | | &#x60;038&#x60; | DIMEX | | &#x60;039&#x60; | CED | | &#x60;040&#x60; | PAS | | &#x60;041&#x60; | Documento Único de Identidad | | &#x60;042&#x60; | NIT Salvadoreño | | &#x60;100&#x60; | Agência e conta | | &#x60;101&#x60; | Código do operador | | &#x60;102&#x60; | Cartão de crédito | | &#x60;103&#x60; | CPF |  |  [optional] |
|**certificate** | **String** | For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded &#x60;certificate&#x60;. If the &#x60;certificate&#x60; parameter is used, you *must* also provide the &#x60;private_key&#x60; parameter.  |  [optional] |
|**privateKey** | **String** | For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded &#x60;private_key&#x60;. If the &#x60;private_key&#x60; parameter is used, you *must* also provide the &#x60;certificate&#x60; parameter.  |  [optional] |



