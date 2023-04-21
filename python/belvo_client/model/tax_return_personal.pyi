# coding: utf-8

"""
    Belvo API Docs

    # Introduction  Belvo is an open banking API for Latin America that allows companies to access banking and fiscal information in a secure as well as agile way.  Through our API, you can access:   - **Bank information** such as account information, real-time balance, historical transactions, and account owner identification.  - **Fiscal information** such as received and sent invoices and tax returns.   <img src=\"https://files.readme.io/acf27d3-belvo_pipes.png\" alt=\"fiscal-endpoints\">   In this API reference you'll find all the information you need about each  endpoint and resource.   <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\">  <strong>Tip: </strong> Make sure that you also check out our Developer Portal for guides on <a href=\"https://developers.belvo.com/docs/get-started-in-5-minutes\" target=\"_blank\">how to get started</a>, using our <a href=\"https://developers.belvo.com/docs/test-in-sandbox\" target=\"_blank\">Sandbox environment</a>, as well as how to <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">integrate the widget</a> or use our <a href=\"https://developers.belvo.com/docs/quickstart-application\" target=\"_blank\">quickstart application</a>.  </div>   ## Environment  We currently offer three environments: sandbox, development, and production.   When using our SDKs, make sure to use the **Alias** (and not the Base URL).   | Environment | Purpose | Access | |-----------|-------|-------| | **Sandbox** | The [Sandbox environment](https://developers.belvo.com/docs/test-in-sandbox) is dedicated for your testing and development phases. In this environment, you can create links without real credentials and you can pull test data from all endpoints. **⚠️The sandbox environment is refreshed frequently and your test data can be updated or deleted.** | Base URL (cURL): https://sandbox.belvo.com/ <br><br>Alias (SDKs): sandbox| |**Development**|The Development environment is dedicated for testing with real credentials and institutions with real-world institutions. You can create up to 25 links for free in this environment.| Base URL (cURL): https://development.belvo.com/ <br><br>Alias (SDKs): development | | **Production** | The Production environment is dedicated for live applications with real connections to institutions. In this environment, you will need real credentials to create links and you will pull real data from the institutions.| Base URL (cURL): https://api.belvo.com/ <br><br>Alias (SDKs): production|   For each environment, you'll need to [generate separate API keys](https://developers.belvo.com/docs/get-your-belvo-api-keys).   ## Response codes   We use the following HTTP status code in the response depending on the success or failure:   | Status Code | Description | |-----------|-------| | `200` | ✅ **Success** - The content is available in the response body. | | `201` | ✅ **Success** - The content was created successfully on Belvo. | | `204` | ✅ **Success** - No content to return. | | `400` | ❌ **Bad Request Error** - Request returned an error, detail in content.| | `401` | ❌ **Unauthorized** - The Belvo credentials provided are not valid.| | `404` | ❌ **Not Found** - The resource you try to access cannot be found.| | `405` | ❌ **Method Not Allowed** - The HTTP method you are using is not accepted for this resource.| | `408` | ❌ **Request Timeout** - The request timed out and was terminated by the server.| | `428` | ❌ **MFA Token Required** - MFA token was required by the institution to connect. | | `500` | ❌ **Internal Server Error** - The detail of the error is available in the response body.|   ## Error handling   ### Error messages   Belvo API errors are returned in JSON format. For example, an error might look like this:   ```json  [     {       \"request_id\": \"a6e1c493d7a29d91aed4338e6fcf077d\",       \"message\": \"This field is required.\",       \"code\": \"required\",       \"field\": \"link\"     } ]  ```   Typically, an error response will have the following parameters:  - `request_id`: a unique ID for the request, you should share it with the Belvo support team for investigations.  - `message`: human-readable description of the error.  - `code`: a unique code for the error. Check the table below to see how to handle each error code.  - `field` *(optional)*: The specific field in the request body that has an issue.    ### Request identifier  When you need help with a specific error, add the request identifier (`request_id`) in your message to the Belvo support team. This will speed up investigations and get you back up and running in no time at all.   ### Error codes and troubleshooting   For a full list of errors and how to troubleshoot them, please see our dedicated [Error handling articles](https://developers.belvo.com/docs/integration-overview#error-handling) in our DevPortal.    ### Retry policy   Please see our recommended [retry policies](https://developers.belvo.com/docs/integration-overview#error-retry-policy) in the DevPortal. 

    The version of the OpenAPI document: 1.35.0
    Contact: support@belvo.com
    Created by: https://developers.belvo.com
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from belvo_client import schemas  # noqa: F401


class TaxReturnPersonal(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "receipt_pdf",
            "dividendos",
            "pdf",
            "servicios_profesionales",
            "determinacion_impuesto",
            "informacion_general",
            "deducciones_personales",
            "retenciones",
            "collected_at",
            "sueldos_salarios",
        }
        
        class properties:
            
            
            class collected_at(
                schemas.DateTimeBase,
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                class MetaOapg:
                    format = 'date-time'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, datetime, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'collected_at':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class informacion_general(
                schemas.DictBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneFrozenDictMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'informacion_general':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class sueldos_salarios(
                schemas.DictBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneFrozenDictMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'sueldos_salarios':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class servicios_profesionales(
                schemas.DictBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneFrozenDictMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'servicios_profesionales':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class deducciones_personales(
                schemas.DictBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneFrozenDictMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'deducciones_personales':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class determinacion_impuesto(
                schemas.DictBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneFrozenDictMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'determinacion_impuesto':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class retenciones(
                schemas.DictBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneFrozenDictMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'retenciones':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class dividendos(
                schemas.DictBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneFrozenDictMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'dividendos':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class pdf(
                schemas.BinaryBase,
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                class MetaOapg:
                    format = 'binary'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'pdf':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class receipt_pdf(
                schemas.BinaryBase,
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                class MetaOapg:
                    format = 'binary'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'receipt_pdf':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            id = schemas.UUIDSchema
            link = schemas.UUIDSchema
            created_at = schemas.DateTimeSchema
            
            
            class datos_informativos(
                schemas.DictBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneFrozenDictMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'datos_informativos':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            __annotations__ = {
                "collected_at": collected_at,
                "informacion_general": informacion_general,
                "sueldos_salarios": sueldos_salarios,
                "servicios_profesionales": servicios_profesionales,
                "deducciones_personales": deducciones_personales,
                "determinacion_impuesto": determinacion_impuesto,
                "retenciones": retenciones,
                "dividendos": dividendos,
                "pdf": pdf,
                "receipt_pdf": receipt_pdf,
                "id": id,
                "link": link,
                "created_at": created_at,
                "datos_informativos": datos_informativos,
            }
        additional_properties = schemas.AnyTypeSchema
    
    receipt_pdf: MetaOapg.properties.receipt_pdf
    dividendos: MetaOapg.properties.dividendos
    pdf: MetaOapg.properties.pdf
    servicios_profesionales: MetaOapg.properties.servicios_profesionales
    determinacion_impuesto: MetaOapg.properties.determinacion_impuesto
    informacion_general: MetaOapg.properties.informacion_general
    deducciones_personales: MetaOapg.properties.deducciones_personales
    retenciones: MetaOapg.properties.retenciones
    collected_at: MetaOapg.properties.collected_at
    sueldos_salarios: MetaOapg.properties.sueldos_salarios
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["receipt_pdf"]) -> MetaOapg.properties.receipt_pdf: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["dividendos"]) -> MetaOapg.properties.dividendos: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pdf"]) -> MetaOapg.properties.pdf: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["servicios_profesionales"]) -> MetaOapg.properties.servicios_profesionales: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["determinacion_impuesto"]) -> MetaOapg.properties.determinacion_impuesto: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["informacion_general"]) -> MetaOapg.properties.informacion_general: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["deducciones_personales"]) -> MetaOapg.properties.deducciones_personales: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["retenciones"]) -> MetaOapg.properties.retenciones: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sueldos_salarios"]) -> MetaOapg.properties.sueldos_salarios: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["link"]) -> MetaOapg.properties.link: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["datos_informativos"]) -> MetaOapg.properties.datos_informativos: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> MetaOapg.additional_properties: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["receipt_pdf"], typing_extensions.Literal["dividendos"], typing_extensions.Literal["pdf"], typing_extensions.Literal["servicios_profesionales"], typing_extensions.Literal["determinacion_impuesto"], typing_extensions.Literal["informacion_general"], typing_extensions.Literal["deducciones_personales"], typing_extensions.Literal["retenciones"], typing_extensions.Literal["collected_at"], typing_extensions.Literal["sueldos_salarios"], typing_extensions.Literal["id"], typing_extensions.Literal["link"], typing_extensions.Literal["created_at"], typing_extensions.Literal["datos_informativos"], str, ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["receipt_pdf"]) -> MetaOapg.properties.receipt_pdf: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["dividendos"]) -> MetaOapg.properties.dividendos: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["pdf"]) -> MetaOapg.properties.pdf: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["servicios_profesionales"]) -> MetaOapg.properties.servicios_profesionales: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["determinacion_impuesto"]) -> MetaOapg.properties.determinacion_impuesto: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["informacion_general"]) -> MetaOapg.properties.informacion_general: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["deducciones_personales"]) -> MetaOapg.properties.deducciones_personales: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["retenciones"]) -> MetaOapg.properties.retenciones: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["sueldos_salarios"]) -> MetaOapg.properties.sueldos_salarios: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["link"]) -> typing.Union[MetaOapg.properties.link, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_at"]) -> typing.Union[MetaOapg.properties.created_at, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["datos_informativos"]) -> typing.Union[MetaOapg.properties.datos_informativos, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[MetaOapg.additional_properties, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["receipt_pdf"], typing_extensions.Literal["dividendos"], typing_extensions.Literal["pdf"], typing_extensions.Literal["servicios_profesionales"], typing_extensions.Literal["determinacion_impuesto"], typing_extensions.Literal["informacion_general"], typing_extensions.Literal["deducciones_personales"], typing_extensions.Literal["retenciones"], typing_extensions.Literal["collected_at"], typing_extensions.Literal["sueldos_salarios"], typing_extensions.Literal["id"], typing_extensions.Literal["link"], typing_extensions.Literal["created_at"], typing_extensions.Literal["datos_informativos"], str, ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        receipt_pdf: typing.Union[MetaOapg.properties.receipt_pdf, None, bytes, io.FileIO, io.BufferedReader, ],
        dividendos: typing.Union[MetaOapg.properties.dividendos, dict, frozendict.frozendict, None, ],
        pdf: typing.Union[MetaOapg.properties.pdf, None, bytes, io.FileIO, io.BufferedReader, ],
        servicios_profesionales: typing.Union[MetaOapg.properties.servicios_profesionales, dict, frozendict.frozendict, None, ],
        determinacion_impuesto: typing.Union[MetaOapg.properties.determinacion_impuesto, dict, frozendict.frozendict, None, ],
        informacion_general: typing.Union[MetaOapg.properties.informacion_general, dict, frozendict.frozendict, None, ],
        deducciones_personales: typing.Union[MetaOapg.properties.deducciones_personales, dict, frozendict.frozendict, None, ],
        retenciones: typing.Union[MetaOapg.properties.retenciones, dict, frozendict.frozendict, None, ],
        collected_at: typing.Union[MetaOapg.properties.collected_at, None, str, datetime, ],
        sueldos_salarios: typing.Union[MetaOapg.properties.sueldos_salarios, dict, frozendict.frozendict, None, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, schemas.Unset] = schemas.unset,
        link: typing.Union[MetaOapg.properties.link, str, uuid.UUID, schemas.Unset] = schemas.unset,
        created_at: typing.Union[MetaOapg.properties.created_at, str, datetime, schemas.Unset] = schemas.unset,
        datos_informativos: typing.Union[MetaOapg.properties.datos_informativos, dict, frozendict.frozendict, None, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.additional_properties, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
    ) -> 'TaxReturnPersonal':
        return super().__new__(
            cls,
            *args,
            receipt_pdf=receipt_pdf,
            dividendos=dividendos,
            pdf=pdf,
            servicios_profesionales=servicios_profesionales,
            determinacion_impuesto=determinacion_impuesto,
            informacion_general=informacion_general,
            deducciones_personales=deducciones_personales,
            retenciones=retenciones,
            collected_at=collected_at,
            sueldos_salarios=sueldos_salarios,
            id=id,
            link=link,
            created_at=created_at,
            datos_informativos=datos_informativos,
            _configuration=_configuration,
            **kwargs,
        )
