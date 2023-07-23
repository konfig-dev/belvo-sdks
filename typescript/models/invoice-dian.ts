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
import { EnumInvoiceDianInvoiceType } from './enum-invoice-dian-invoice-type';
// May contain unused imports in some cases
// @ts-ignore
import { EnumInvoiceDianPaymentMethod } from './enum-invoice-dian-payment-method';
// May contain unused imports in some cases
// @ts-ignore
import { EnumInvoiceType } from './enum-invoice-type';
// May contain unused imports in some cases
// @ts-ignore
import { InvoiceDetailDian } from './invoice-detail-dian';
// May contain unused imports in some cases
// @ts-ignore
import { InvoiceSenderDetailsDian } from './invoice-sender-details-dian';
// May contain unused imports in some cases
// @ts-ignore
import { InvoiceWarningsDian } from './invoice-warnings-dian';
// May contain unused imports in some cases
// @ts-ignore
import { InvoicesPaymentsDian } from './invoices-payments-dian';
// May contain unused imports in some cases
// @ts-ignore
import { InvoicesPayrollDian } from './invoices-payroll-dian';
// May contain unused imports in some cases
// @ts-ignore
import { InvoicesReceiverDetailsDian } from './invoices-receiver-details-dian';

/**
 * 
 * @export
 * @interface InvoiceDian
 */
export interface InvoiceDian {
    /**
     * **Note**: This field is not applicable for DIAN Colombia and will return `null`. 
     * @type {string}
     * @memberof InvoiceDian
     */
    'version'?: string | null;
    /**
     * Belvo\'s unique identifier for the current invoice.
     * @type {string}
     * @memberof InvoiceDian
     */
    'id'?: string;
    /**
     * The `link.id` the invoice belongs to.
     * @type {string}
     * @memberof InvoiceDian
     */
    'link'?: string;
    /**
     * The ISO-8601 timestamp when the data point was collected.
     * @type {string}
     * @memberof InvoiceDian
     */
    'collected_at': string | null;
    /**
     * The ISO-8601 timestamp of when the data point was last updated in Belvo\'s database.
     * @type {string}
     * @memberof InvoiceDian
     */
    'created_at'?: string;
    /**
     * The fiscal institution\'s unique ID for the invoice.
     * @type {string}
     * @memberof InvoiceDian
     */
    'invoice_identification': string | null;
    /**
     * The date of the invoice.
     * @type {string}
     * @memberof InvoiceDian
     */
    'invoice_date': string | null;
    /**
     * The status of the invoice. Can be one of:    - *Vigente* (valid)   - *Cancelado* (cancelled)   - *Aprobado* (approved)
     * @type {string}
     * @memberof InvoiceDian
     */
    'status': string | null;
    /**
     * Indicates when the invoice is set to expire.  For example: If the invoice is paid in installments, this field indicates the date when the installment is to be paid. 
     * @type {string}
     * @memberof InvoiceDian
     */
    'expiration_date'?: string | null;
    /**
     * 
     * @type {EnumInvoiceDianInvoiceType}
     * @memberof InvoiceDian
     */
    'invoice_type': EnumInvoiceDianInvoiceType | null;
    /**
     * 
     * @type {EnumInvoiceType}
     * @memberof InvoiceDian
     */
    'type': EnumInvoiceType | null;
    /**
     * The fiscal ID of the invoice sender.
     * @type {string}
     * @memberof InvoiceDian
     */
    'sender_id': string | null;
    /**
     * The name of the invoice sender.
     * @type {string}
     * @memberof InvoiceDian
     */
    'sender_name': string | null;
    /**
     * 
     * @type {InvoiceSenderDetailsDian}
     * @memberof InvoiceDian
     */
    'sender_details'?: InvoiceSenderDetailsDian | null;
    /**
     * Indicates whether or not the sender is on a tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution\'s regulations. **Note**: This field is not applicable for DIAN Colombia and will return `null`.
     * @type {string}
     * @memberof InvoiceDian
     */
    'sender_tax_fraud_status'?: string | null;
    /**
     * The fiscal ID of the invoice receiver.
     * @type {string}
     * @memberof InvoiceDian
     */
    'receiver_id': string | null;
    /**
     * The name of the invoice receiver.
     * @type {string}
     * @memberof InvoiceDian
     */
    'receiver_name': string | null;
    /**
     * 
     * @type {InvoicesReceiverDetailsDian}
     * @memberof InvoiceDian
     */
    'receiver_details'?: InvoicesReceiverDetailsDian | null;
    /**
     * **Note**: This field is not applicable for DIAN Colombia and will return `null`.
     * @type {string}
     * @memberof InvoiceDian
     */
    'receiver_tax_fraud_status'?: string | null;
    /**
     * **Note**: This field is not applicable for DIAN Colombia and will return `null`.
     * @type {string}
     * @memberof InvoiceDian
     */
    'cancelation_status': string | null;
    /**
     * **Note**: This field is not applicable for DIAN Colombia and will return `null`. 
     * @type {string}
     * @memberof InvoiceDian
     */
    'cancelation_update_date': string | null;
    /**
     * **Note**: This field is not applicable for DIAN Colombia and will return `null`. 
     * @type {string}
     * @memberof InvoiceDian
     */
    'certification_date': string | null;
    /**
     * **Note**: This field is not applicable for DIAN Colombia and will return `null`. 
     * @type {string}
     * @memberof InvoiceDian
     */
    'certification_authority': string | null;
    /**
     * The payment type code used for this invoice, as defined by the country legal entity.  For detailed information regarding DIAN\'s payment types, please see their [official PDF](https://www.dian.gov.co/impuestos/factura-electronica/Documents/Anexo_tecnico_factura_electronica_vr_1_7_2020.pdf).  
     * @type {string}
     * @memberof InvoiceDian
     */
    'payment_type': string | null;
    /**
     * The description of the payment method used for this invoice. 
     * @type {string}
     * @memberof InvoiceDian
     */
    'payment_type_description': string | null;
    /**
     * 
     * @type {EnumInvoiceDianPaymentMethod}
     * @memberof InvoiceDian
     */
    'payment_method'?: EnumInvoiceDianPaymentMethod | null;
    /**
     * The description of the payment method used for this invoice. 
     * @type {string}
     * @memberof InvoiceDian
     * @deprecated
     */
    'payment_method_description'?: string | null;
    /**
     * **Note**: This field is not applicable for DIAN Colombia and will return `null`. 
     * @type {string}
     * @memberof InvoiceDian
     */
    'usage'?: string | null;
    /**
     * **Note**: This field is not applicable for DIAN Colombia and will return `null`. 
     * @type {string}
     * @memberof InvoiceDian
     */
    'place_of_issue'?: string | null;
    /**
     * **Note**: This field is not applicable for DIAN Colombia and will return `null`. 
     * @type {Array<InvoiceDetailDian>}
     * @memberof InvoiceDian
     */
    'invoice_details': Array<InvoiceDetailDian>;
    /**
     * The currency of the invoice. For example:    - 🇧🇷 BRL (Brazilian Real)  - 🇨🇴 COP (Colombian Peso)  - 🇲🇽 MXN (Mexican Peso)  - 🇺🇸 USD (United States Dollar) 
     * @type {string}
     * @memberof InvoiceDian
     */
    'currency': string | null;
    /**
     * The pretax amount of this invoice (sum of each item\'s `pre_tax_amount`). 
     * @type {number}
     * @memberof InvoiceDian
     */
    'subtotal_amount': number | null;
    /**
     * The exchange rate used in this invoice for the currency. 
     * @type {number}
     * @memberof InvoiceDian
     */
    'exchange_rate': number | null;
    /**
     * The amount of tax for this invoice (sum of each item\'s `tax_amount`). 
     * @type {number}
     * @memberof InvoiceDian
     */
    'tax_amount': number | null;
    /**
     * The total amount discounted in this invoice. 
     * @type {number}
     * @memberof InvoiceDian
     */
    'discount_amount': number | null;
    /**
     * The total amount of the invoice (`subtotal_amount` + `tax_amount` - `discount_amount`)
     * @type {number}
     * @memberof InvoiceDian
     */
    'total_amount': number | null;
    /**
     * **Note**: This field is not applicable for DIAN Colombia and will return `null`. 
     * @type {Array<InvoicesPaymentsDian>}
     * @memberof InvoiceDian
     */
    'payments': Array<InvoicesPaymentsDian>;
    /**
     * 
     * @type {InvoicesPayrollDian}
     * @memberof InvoiceDian
     */
    'payroll': InvoicesPayrollDian | null;
    /**
     * **Note**: This field is not applicable for DIAN Colombia and will return `null`. 
     * @type {string}
     * @memberof InvoiceDian
     */
    'folio'?: string | null;
    /**
     * **Note**: This field is not applicable for DIAN Colombia and will return `null`. 
     * @type {string}
     * @memberof InvoiceDian
     */
    'xml'?: string | null;
    /**
     * 
     * @type {InvoiceWarningsDian}
     * @memberof InvoiceDian
     */
    'warnings'?: InvoiceWarningsDian | null;
}

