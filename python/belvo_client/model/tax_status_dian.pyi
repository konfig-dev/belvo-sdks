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


class TaxStatusDian(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "official_name",
            "address",
            "id_cif",
            "tax_payer_information",
            "link",
            "obligations",
            "created_at",
            "economic_activity",
            "place_and_date_of_issuance",
            "collected_at",
            "pdf",
            "digital_stamp",
            "digital_stamp_chain",
            "id",
            "regimen",
        }
        
        class properties:
            id = schemas.UUIDSchema
            link = schemas.UUIDSchema
            
            
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
            created_at = schemas.DateTimeSchema
            
            
            class place_and_date_of_issuance(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'place_and_date_of_issuance':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class official_name(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'official_name':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class id_cif(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'id_cif':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def tax_payer_information() -> typing.Type['TaxStatusTaxPayerInformationDian']:
                return TaxStatusTaxPayerInformationDian
        
            @staticmethod
            def address() -> typing.Type['TaxStatusAddressDian']:
                return TaxStatusAddressDian
            
            
            class economic_activity(
                schemas.ListBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneTupleMixin
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['TaxStatusEconomicActivityDian']:
                        return TaxStatusEconomicActivityDian
            
            
                def __new__(
                    cls,
                    *args: typing.Union[list, tuple, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'economic_activity':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class obligations(
                schemas.ListBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneTupleMixin
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['TaxStatusObligationsDian']:
                        return TaxStatusObligationsDian
            
            
                def __new__(
                    cls,
                    *args: typing.Union[list, tuple, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'obligations':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class digital_stamp(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'digital_stamp':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class digital_stamp_chain(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'digital_stamp_chain':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
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
            
            
            class regimens(
                schemas.ListBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneTupleMixin
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['TaxStatusRegimensDian']:
                        return TaxStatusRegimensDian
            
            
                def __new__(
                    cls,
                    *args: typing.Union[list, tuple, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'regimens':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            __annotations__ = {
                "id": id,
                "link": link,
                "collected_at": collected_at,
                "created_at": created_at,
                "place_and_date_of_issuance": place_and_date_of_issuance,
                "official_name": official_name,
                "id_cif": id_cif,
                "tax_payer_information": tax_payer_information,
                "address": address,
                "economic_activity": economic_activity,
                "obligations": obligations,
                "digital_stamp": digital_stamp,
                "digital_stamp_chain": digital_stamp_chain,
                "pdf": pdf,
                "regimens": regimens,
            }
    
    official_name: MetaOapg.properties.official_name
    address: 'TaxStatusAddressDian'
    id_cif: MetaOapg.properties.id_cif
    tax_payer_information: 'TaxStatusTaxPayerInformationDian'
    link: MetaOapg.properties.link
    obligations: MetaOapg.properties.obligations
    created_at: MetaOapg.properties.created_at
    economic_activity: MetaOapg.properties.economic_activity
    place_and_date_of_issuance: MetaOapg.properties.place_and_date_of_issuance
    collected_at: MetaOapg.properties.collected_at
    pdf: MetaOapg.properties.pdf
    digital_stamp: MetaOapg.properties.digital_stamp
    digital_stamp_chain: MetaOapg.properties.digital_stamp_chain
    id: MetaOapg.properties.id
    regimen: schemas.AnyTypeSchema
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["link"]) -> MetaOapg.properties.link: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["place_and_date_of_issuance"]) -> MetaOapg.properties.place_and_date_of_issuance: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["official_name"]) -> MetaOapg.properties.official_name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id_cif"]) -> MetaOapg.properties.id_cif: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["tax_payer_information"]) -> 'TaxStatusTaxPayerInformationDian': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["address"]) -> 'TaxStatusAddressDian': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["economic_activity"]) -> MetaOapg.properties.economic_activity: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["obligations"]) -> MetaOapg.properties.obligations: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["digital_stamp"]) -> MetaOapg.properties.digital_stamp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["digital_stamp_chain"]) -> MetaOapg.properties.digital_stamp_chain: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pdf"]) -> MetaOapg.properties.pdf: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["regimens"]) -> MetaOapg.properties.regimens: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["id", "link", "collected_at", "created_at", "place_and_date_of_issuance", "official_name", "id_cif", "tax_payer_information", "address", "economic_activity", "obligations", "digital_stamp", "digital_stamp_chain", "pdf", "regimens", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["link"]) -> MetaOapg.properties.link: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["place_and_date_of_issuance"]) -> MetaOapg.properties.place_and_date_of_issuance: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["official_name"]) -> MetaOapg.properties.official_name: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id_cif"]) -> MetaOapg.properties.id_cif: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["tax_payer_information"]) -> 'TaxStatusTaxPayerInformationDian': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["address"]) -> 'TaxStatusAddressDian': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["economic_activity"]) -> MetaOapg.properties.economic_activity: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["obligations"]) -> MetaOapg.properties.obligations: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["digital_stamp"]) -> MetaOapg.properties.digital_stamp: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["digital_stamp_chain"]) -> MetaOapg.properties.digital_stamp_chain: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["pdf"]) -> MetaOapg.properties.pdf: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["regimens"]) -> typing.Union[MetaOapg.properties.regimens, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["id", "link", "collected_at", "created_at", "place_and_date_of_issuance", "official_name", "id_cif", "tax_payer_information", "address", "economic_activity", "obligations", "digital_stamp", "digital_stamp_chain", "pdf", "regimens", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        official_name: typing.Union[MetaOapg.properties.official_name, None, str, ],
        address: 'TaxStatusAddressDian',
        id_cif: typing.Union[MetaOapg.properties.id_cif, None, str, ],
        tax_payer_information: 'TaxStatusTaxPayerInformationDian',
        link: typing.Union[MetaOapg.properties.link, str, uuid.UUID, ],
        obligations: typing.Union[MetaOapg.properties.obligations, list, tuple, None, ],
        created_at: typing.Union[MetaOapg.properties.created_at, str, datetime, ],
        economic_activity: typing.Union[MetaOapg.properties.economic_activity, list, tuple, None, ],
        place_and_date_of_issuance: typing.Union[MetaOapg.properties.place_and_date_of_issuance, None, str, ],
        collected_at: typing.Union[MetaOapg.properties.collected_at, None, str, datetime, ],
        pdf: typing.Union[MetaOapg.properties.pdf, None, bytes, io.FileIO, io.BufferedReader, ],
        digital_stamp: typing.Union[MetaOapg.properties.digital_stamp, None, str, ],
        digital_stamp_chain: typing.Union[MetaOapg.properties.digital_stamp_chain, None, str, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, ],
        regimen: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        regimens: typing.Union[MetaOapg.properties.regimens, list, tuple, None, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'TaxStatusDian':
        return super().__new__(
            cls,
            *args,
            official_name=official_name,
            address=address,
            id_cif=id_cif,
            tax_payer_information=tax_payer_information,
            link=link,
            obligations=obligations,
            created_at=created_at,
            economic_activity=economic_activity,
            place_and_date_of_issuance=place_and_date_of_issuance,
            collected_at=collected_at,
            pdf=pdf,
            digital_stamp=digital_stamp,
            digital_stamp_chain=digital_stamp_chain,
            id=id,
            regimen=regimen,
            regimens=regimens,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.tax_status_address_dian import TaxStatusAddressDian
from belvo_client.model.tax_status_economic_activity_dian import TaxStatusEconomicActivityDian
from belvo_client.model.tax_status_obligations_dian import TaxStatusObligationsDian
from belvo_client.model.tax_status_regimens_dian import TaxStatusRegimensDian
from belvo_client.model.tax_status_tax_payer_information_dian import TaxStatusTaxPayerInformationDian
