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


class TaxDeclarationBusiness(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "pdf",
            "annual_income_statement",
            "equity_statement",
            "annual_costs_and_deductions_statement",
            "date_issued",
            "document_information",
            "tax_payer_information",
            "link",
            "created_at",
            "id",
            "tax_assessment",
            "collected_at",
        }
        
        class properties:
            id = schemas.UUIDSchema
            link = schemas.UUIDSchema
            collected_at = schemas.DateTimeSchema
            created_at = schemas.DateTimeSchema
        
            @staticmethod
            def document_information() -> typing.Type['DocumentInformationBusiness']:
                return DocumentInformationBusiness
        
            @staticmethod
            def tax_payer_information() -> typing.Type['TaxPayerInformationBusiness']:
                return TaxPayerInformationBusiness
        
            @staticmethod
            def equity_statement() -> typing.Type['EquityStatementBusiness']:
                return EquityStatementBusiness
        
            @staticmethod
            def annual_income_statement() -> typing.Type['AnnualIncomeStatementBusiness']:
                return AnnualIncomeStatementBusiness
        
            @staticmethod
            def annual_costs_and_deductions_statement() -> typing.Type['AnnualCostsAndDeductionsStatementBusiness']:
                return AnnualCostsAndDeductionsStatementBusiness
        
            @staticmethod
            def tax_assessment() -> typing.Type['TaxAssessmentBusiness']:
                return TaxAssessmentBusiness
            date_issued = schemas.DateSchema
            
            
            class pdf(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'pdf':
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
                "document_information": document_information,
                "tax_payer_information": tax_payer_information,
                "equity_statement": equity_statement,
                "annual_income_statement": annual_income_statement,
                "annual_costs_and_deductions_statement": annual_costs_and_deductions_statement,
                "tax_assessment": tax_assessment,
                "date_issued": date_issued,
                "pdf": pdf,
            }
    
    pdf: MetaOapg.properties.pdf
    annual_income_statement: 'AnnualIncomeStatementBusiness'
    equity_statement: 'EquityStatementBusiness'
    annual_costs_and_deductions_statement: 'AnnualCostsAndDeductionsStatementBusiness'
    date_issued: MetaOapg.properties.date_issued
    document_information: 'DocumentInformationBusiness'
    tax_payer_information: 'TaxPayerInformationBusiness'
    link: MetaOapg.properties.link
    created_at: MetaOapg.properties.created_at
    id: MetaOapg.properties.id
    tax_assessment: 'TaxAssessmentBusiness'
    collected_at: MetaOapg.properties.collected_at
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["link"]) -> MetaOapg.properties.link: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["document_information"]) -> 'DocumentInformationBusiness': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["tax_payer_information"]) -> 'TaxPayerInformationBusiness': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["equity_statement"]) -> 'EquityStatementBusiness': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["annual_income_statement"]) -> 'AnnualIncomeStatementBusiness': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["annual_costs_and_deductions_statement"]) -> 'AnnualCostsAndDeductionsStatementBusiness': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["tax_assessment"]) -> 'TaxAssessmentBusiness': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date_issued"]) -> MetaOapg.properties.date_issued: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pdf"]) -> MetaOapg.properties.pdf: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["id", "link", "collected_at", "created_at", "document_information", "tax_payer_information", "equity_statement", "annual_income_statement", "annual_costs_and_deductions_statement", "tax_assessment", "date_issued", "pdf", ], str]):
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
    def get_item_oapg(self, name: typing_extensions.Literal["document_information"]) -> 'DocumentInformationBusiness': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["tax_payer_information"]) -> 'TaxPayerInformationBusiness': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["equity_statement"]) -> 'EquityStatementBusiness': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["annual_income_statement"]) -> 'AnnualIncomeStatementBusiness': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["annual_costs_and_deductions_statement"]) -> 'AnnualCostsAndDeductionsStatementBusiness': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["tax_assessment"]) -> 'TaxAssessmentBusiness': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["date_issued"]) -> MetaOapg.properties.date_issued: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["pdf"]) -> MetaOapg.properties.pdf: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["id", "link", "collected_at", "created_at", "document_information", "tax_payer_information", "equity_statement", "annual_income_statement", "annual_costs_and_deductions_statement", "tax_assessment", "date_issued", "pdf", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        pdf: typing.Union[MetaOapg.properties.pdf, None, str, ],
        annual_income_statement: 'AnnualIncomeStatementBusiness',
        equity_statement: 'EquityStatementBusiness',
        annual_costs_and_deductions_statement: 'AnnualCostsAndDeductionsStatementBusiness',
        date_issued: typing.Union[MetaOapg.properties.date_issued, str, date, ],
        document_information: 'DocumentInformationBusiness',
        tax_payer_information: 'TaxPayerInformationBusiness',
        link: typing.Union[MetaOapg.properties.link, str, uuid.UUID, ],
        created_at: typing.Union[MetaOapg.properties.created_at, str, datetime, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, ],
        tax_assessment: 'TaxAssessmentBusiness',
        collected_at: typing.Union[MetaOapg.properties.collected_at, str, datetime, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'TaxDeclarationBusiness':
        return super().__new__(
            cls,
            *args,
            pdf=pdf,
            annual_income_statement=annual_income_statement,
            equity_statement=equity_statement,
            annual_costs_and_deductions_statement=annual_costs_and_deductions_statement,
            date_issued=date_issued,
            document_information=document_information,
            tax_payer_information=tax_payer_information,
            link=link,
            created_at=created_at,
            id=id,
            tax_assessment=tax_assessment,
            collected_at=collected_at,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.annual_costs_and_deductions_statement_business import AnnualCostsAndDeductionsStatementBusiness
from belvo_client.model.annual_income_statement_business import AnnualIncomeStatementBusiness
from belvo_client.model.document_information_business import DocumentInformationBusiness
from belvo_client.model.equity_statement_business import EquityStatementBusiness
from belvo_client.model.tax_assessment_business import TaxAssessmentBusiness
from belvo_client.model.tax_payer_information_business import TaxPayerInformationBusiness
