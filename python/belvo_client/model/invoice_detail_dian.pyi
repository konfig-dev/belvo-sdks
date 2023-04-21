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


class InvoiceDetailDian(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "tax_amount",
            "quantity",
            "total_amount",
            "product_identification",
            "tax_percentage",
            "description",
            "unit_code",
            "pre_tax_amount",
            "unit_amount",
            "unit_description",
        }
        
        class properties:
            
            
            class description(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'description':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class product_identification(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'product_identification':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class quantity(
                schemas.Float32Base,
                schemas.NumberBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                class MetaOapg:
                    format = 'float'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, float, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'quantity':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class unit_code(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'unit_code':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class unit_description(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'unit_description':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class unit_amount(
                schemas.Float32Base,
                schemas.NumberBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                class MetaOapg:
                    format = 'float'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, float, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'unit_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class pre_tax_amount(
                schemas.Float32Base,
                schemas.NumberBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                class MetaOapg:
                    format = 'float'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, float, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'pre_tax_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class tax_percentage(
                schemas.Float32Base,
                schemas.NumberBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                class MetaOapg:
                    format = 'float'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, float, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'tax_percentage':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class tax_amount(
                schemas.Float32Base,
                schemas.NumberBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                class MetaOapg:
                    format = 'float'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, float, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'tax_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class total_amount(
                schemas.Float32Base,
                schemas.NumberBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                class MetaOapg:
                    format = 'float'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, float, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'total_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class tax_type(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'tax_type':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
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
            __annotations__ = {
                "description": description,
                "product_identification": product_identification,
                "quantity": quantity,
                "unit_code": unit_code,
                "unit_description": unit_description,
                "unit_amount": unit_amount,
                "pre_tax_amount": pre_tax_amount,
                "tax_percentage": tax_percentage,
                "tax_amount": tax_amount,
                "total_amount": total_amount,
                "tax_type": tax_type,
                "collected_at": collected_at,
            }
    
    tax_amount: MetaOapg.properties.tax_amount
    quantity: MetaOapg.properties.quantity
    total_amount: MetaOapg.properties.total_amount
    product_identification: MetaOapg.properties.product_identification
    tax_percentage: MetaOapg.properties.tax_percentage
    description: MetaOapg.properties.description
    unit_code: MetaOapg.properties.unit_code
    pre_tax_amount: MetaOapg.properties.pre_tax_amount
    unit_amount: MetaOapg.properties.unit_amount
    unit_description: MetaOapg.properties.unit_description
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["description"]) -> MetaOapg.properties.description: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["product_identification"]) -> MetaOapg.properties.product_identification: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["quantity"]) -> MetaOapg.properties.quantity: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["unit_code"]) -> MetaOapg.properties.unit_code: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["unit_description"]) -> MetaOapg.properties.unit_description: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["unit_amount"]) -> MetaOapg.properties.unit_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pre_tax_amount"]) -> MetaOapg.properties.pre_tax_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["tax_percentage"]) -> MetaOapg.properties.tax_percentage: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["tax_amount"]) -> MetaOapg.properties.tax_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_amount"]) -> MetaOapg.properties.total_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["tax_type"]) -> MetaOapg.properties.tax_type: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["description", "product_identification", "quantity", "unit_code", "unit_description", "unit_amount", "pre_tax_amount", "tax_percentage", "tax_amount", "total_amount", "tax_type", "collected_at", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["description"]) -> MetaOapg.properties.description: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["product_identification"]) -> MetaOapg.properties.product_identification: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["quantity"]) -> MetaOapg.properties.quantity: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["unit_code"]) -> MetaOapg.properties.unit_code: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["unit_description"]) -> MetaOapg.properties.unit_description: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["unit_amount"]) -> MetaOapg.properties.unit_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["pre_tax_amount"]) -> MetaOapg.properties.pre_tax_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["tax_percentage"]) -> MetaOapg.properties.tax_percentage: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["tax_amount"]) -> MetaOapg.properties.tax_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_amount"]) -> MetaOapg.properties.total_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["tax_type"]) -> typing.Union[MetaOapg.properties.tax_type, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["collected_at"]) -> typing.Union[MetaOapg.properties.collected_at, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["description", "product_identification", "quantity", "unit_code", "unit_description", "unit_amount", "pre_tax_amount", "tax_percentage", "tax_amount", "total_amount", "tax_type", "collected_at", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        tax_amount: typing.Union[MetaOapg.properties.tax_amount, None, decimal.Decimal, int, float, ],
        quantity: typing.Union[MetaOapg.properties.quantity, None, decimal.Decimal, int, float, ],
        total_amount: typing.Union[MetaOapg.properties.total_amount, None, decimal.Decimal, int, float, ],
        product_identification: typing.Union[MetaOapg.properties.product_identification, None, str, ],
        tax_percentage: typing.Union[MetaOapg.properties.tax_percentage, None, decimal.Decimal, int, float, ],
        description: typing.Union[MetaOapg.properties.description, None, str, ],
        unit_code: typing.Union[MetaOapg.properties.unit_code, None, str, ],
        pre_tax_amount: typing.Union[MetaOapg.properties.pre_tax_amount, None, decimal.Decimal, int, float, ],
        unit_amount: typing.Union[MetaOapg.properties.unit_amount, None, decimal.Decimal, int, float, ],
        unit_description: typing.Union[MetaOapg.properties.unit_description, None, str, ],
        tax_type: typing.Union[MetaOapg.properties.tax_type, None, str, schemas.Unset] = schemas.unset,
        collected_at: typing.Union[MetaOapg.properties.collected_at, None, str, datetime, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'InvoiceDetailDian':
        return super().__new__(
            cls,
            *args,
            tax_amount=tax_amount,
            quantity=quantity,
            total_amount=total_amount,
            product_identification=product_identification,
            tax_percentage=tax_percentage,
            description=description,
            unit_code=unit_code,
            pre_tax_amount=pre_tax_amount,
            unit_amount=unit_amount,
            unit_description=unit_description,
            tax_type=tax_type,
            collected_at=collected_at,
            _configuration=_configuration,
            **kwargs,
        )
