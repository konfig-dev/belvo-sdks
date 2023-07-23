/* tslint:disable */
/* eslint-disable */
/**
 * Belvo API Docs
 * # Introduction  Belvo is an open banking API for Latin America that allows companies to access banking and fiscal information in a secure as well as agile way.  Through our API, you can access:   - **Bank information** such as account information, real-time balance, historical transactions, and account owner identification.  - **Fiscal information** such as received and sent invoices and tax returns.   <img src=\"https://files.readme.io/acf27d3-belvo_pipes.png\" alt=\"fiscal-endpoints\">   In this API reference you\'ll find all the information you need about each  endpoint and resource.   <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\">  <strong>Tip: </strong> Make sure that you also check out our Developer Portal for guides on <a href=\"https://developers.belvo.com/docs/get-started-in-5-minutes\" target=\"_blank\">how to get started</a>, using our <a href=\"https://developers.belvo.com/docs/test-in-sandbox\" target=\"_blank\">Sandbox environment</a>, as well as how to <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">integrate the widget</a> or use our <a href=\"https://developers.belvo.com/docs/quickstart-application\" target=\"_blank\">quickstart application</a>.  </div>   ## Environment  We currently offer three environments: sandbox, development, and production.   When using our SDKs, make sure to use the **Alias** (and not the Base URL).   | Environment | Purpose | Access | |-----------|-------|-------| | **Sandbox** | The [Sandbox environment](https://developers.belvo.com/docs/test-in-sandbox) is dedicated for your testing and development phases. In this environment, you can create links without real credentials and you can pull test data from all endpoints. **⚠️The sandbox environment is refreshed frequently and your test data can be updated or deleted.** | Base URL (cURL): https://sandbox.belvo.com/ <br><br>Alias (SDKs): sandbox| |**Development**|The Development environment is dedicated for testing with real credentials and institutions with real-world institutions. You can create up to 25 links for free in this environment.| Base URL (cURL): https://development.belvo.com/ <br><br>Alias (SDKs): development | | **Production** | The Production environment is dedicated for live applications with real connections to institutions. In this environment, you will need real credentials to create links and you will pull real data from the institutions.| Base URL (cURL): https://api.belvo.com/ <br><br>Alias (SDKs): production|   For each environment, you\'ll need to [generate separate API keys](https://developers.belvo.com/docs/get-your-belvo-api-keys).   ## Response codes   We use the following HTTP status code in the response depending on the success or failure:   | Status Code | Description | |-----------|-------| | `200` | ✅ **Success** - The content is available in the response body. | | `201` | ✅ **Success** - The content was created successfully on Belvo. | | `204` | ✅ **Success** - No content to return. | | `400` | ❌ **Bad Request Error** - Request returned an error, detail in content.| | `401` | ❌ **Unauthorized** - The Belvo credentials provided are not valid.| | `404` | ❌ **Not Found** - The resource you try to access cannot be found.| | `405` | ❌ **Method Not Allowed** - The HTTP method you are using is not accepted for this resource.| | `408` | ❌ **Request Timeout** - The request timed out and was terminated by the server.| | `428` | ❌ **MFA Token Required** - MFA token was required by the institution to connect. | | `500` | ❌ **Internal Server Error** - The detail of the error is available in the response body.|   ## Error handling   ### Error messages   Belvo API errors are returned in JSON format. For example, an error might look like this:   ```json  [     {       \"request_id\": \"a6e1c493d7a29d91aed4338e6fcf077d\",       \"message\": \"This field is required.\",       \"code\": \"required\",       \"field\": \"link\"     } ]  ```   Typically, an error response will have the following parameters:  - `request_id`: a unique ID for the request, you should share it with the Belvo support team for investigations.  - `message`: human-readable description of the error.  - `code`: a unique code for the error. Check the table below to see how to handle each error code.  - `field` *(optional)*: The specific field in the request body that has an issue.    ### Request identifier  When you need help with a specific error, add the request identifier (`request_id`) in your message to the Belvo support team. This will speed up investigations and get you back up and running in no time at all.   ### Error codes and troubleshooting   For a full list of errors and how to troubleshoot them, please see our dedicated [Error handling articles](https://developers.belvo.com/docs/integration-overview#error-handling) in our DevPortal.    ### Retry policy   Please see our recommended [retry policies](https://developers.belvo.com/docs/integration-overview#error-retry-policy) in the DevPortal. 
 *
 * The version of the OpenAPI document: 1.35.0
 * Contact: support@belvo.com
 *
 * NOTE: This file is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */

// May contain unused imports in some cases
// @ts-ignore
import { EnumInvestmentPortfolioInstrumentType } from './enum-investment-portfolio-instrument-type';
// May contain unused imports in some cases
// @ts-ignore
import { InvestmentsPortfolioInstrumentFees } from './investments-portfolio-instrument-fees';
// May contain unused imports in some cases
// @ts-ignore
import { InvestmentsPortfolioInstrumentInterestRate } from './investments-portfolio-instrument-interest-rate';
// May contain unused imports in some cases
// @ts-ignore
import { InvestmentsPortfolioInstrumentPublicId } from './investments-portfolio-instrument-public-id';
// May contain unused imports in some cases
// @ts-ignore
import { InvestmentsPortfolioInstrumentRedemptionConditions } from './investments-portfolio-instrument-redemption-conditions';

/**
 * 
 * @export
 * @interface InvestmentsPortfolioInstrument
 */
export interface InvestmentsPortfolioInstrument {
    /**
     * Belvo\'s unique ID for the current instrument.
     * @type {string}
     * @memberof InvestmentsPortfolioInstrument
     */
    'id'?: string;
    /**
     * The public identifiers for the instrument.
     * @type {Array<InvestmentsPortfolioInstrumentPublicId>}
     * @memberof InvestmentsPortfolioInstrument
     */
    'public_id': Array<InvestmentsPortfolioInstrumentPublicId> | null;
    /**
     * 
     * @type {EnumInvestmentPortfolioInstrumentType}
     * @memberof InvestmentsPortfolioInstrument
     */
    'type': EnumInvestmentPortfolioInstrumentType;
    /**
     * The subtype for the instrument, as given by the institution.
     * @type {string}
     * @memberof InvestmentsPortfolioInstrument
     */
    'subtype': string | null;
    /**
     * The name of the instrument, as given by the institution.
     * @type {string}
     * @memberof InvestmentsPortfolioInstrument
     */
    'name': string;
    /**
     * The currency of the instrument. For example:  - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso) - 🇺🇸 USD (US Dollar)   Please note that other currencies other than in the list above may be returned. 
     * @type {string}
     * @memberof InvestmentsPortfolioInstrument
     */
    'currency': string;
    /**
     * The current price of one share in the instrument.
     * @type {number}
     * @memberof InvestmentsPortfolioInstrument
     */
    'price': number | null;
    /**
     * The total amount of shares owned in the instrument.
     * @type {number}
     * @memberof InvestmentsPortfolioInstrument
     */
    'quantity': number | null;
    /**
     * The total gross value of the instrument (including taxes).
     * @type {number}
     * @memberof InvestmentsPortfolioInstrument
     */
    'balance_gross': number | null;
    /**
     * The total net value of the instrument (excluding taxes).
     * @type {number}
     * @memberof InvestmentsPortfolioInstrument
     */
    'balance_net': number | null;
    /**
     * The average price of each share acquired in the instrument.
     * @type {number}
     * @memberof InvestmentsPortfolioInstrument
     */
    'average_acquisition_price': number | null;
    /**
     * The current profit earned in the instrument.
     * @type {number}
     * @memberof InvestmentsPortfolioInstrument
     */
    'profit': number | null;
    /**
     * The start date of the instrument. Only applicable for instruments of type `bond` or `savings`.
     * @type {string}
     * @memberof InvestmentsPortfolioInstrument
     */
    'open_date': string | null;
    /**
     * An array of conditions that apply to the instrument in order to retrieve the final value.  For example, the due date, the liquidity date, the previdencia type, and so on. 
     * @type {Array<InvestmentsPortfolioInstrumentRedemptionConditions>}
     * @memberof InvestmentsPortfolioInstrument
     */
    'redemption_conditions': Array<InvestmentsPortfolioInstrumentRedemptionConditions> | null;
    /**
     * An array of fees that apply to the instrument.
     * @type {Array<InvestmentsPortfolioInstrumentFees>}
     * @memberof InvestmentsPortfolioInstrument
     */
    'fees': Array<InvestmentsPortfolioInstrumentFees> | null;
    /**
     * An array of interest rates that apply to the instrument.
     * @type {Array<InvestmentsPortfolioInstrumentInterestRate>}
     * @memberof InvestmentsPortfolioInstrument
     */
    'interest_rates': Array<InvestmentsPortfolioInstrumentInterestRate> | null;
}

