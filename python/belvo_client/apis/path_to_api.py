import typing_extensions

from belvo_client.paths import PathValues
from belvo_client.apis.paths.api_links import ApiLinks
from belvo_client.apis.paths.api_links_id import ApiLinksId
from belvo_client.apis.paths.api_accounts import ApiAccounts
from belvo_client.apis.paths.api_accounts_id import ApiAccountsId
from belvo_client.apis.paths.api_transactions import ApiTransactions
from belvo_client.apis.paths.api_transactions_id import ApiTransactionsId
from belvo_client.apis.paths.api_balances import ApiBalances
from belvo_client.apis.paths.api_balances_id import ApiBalancesId
from belvo_client.apis.paths.api_institutions import ApiInstitutions
from belvo_client.apis.paths.api_institutions_id import ApiInstitutionsId
from belvo_client.apis.paths.api_owners import ApiOwners
from belvo_client.apis.paths.api_owners_id import ApiOwnersId
from belvo_client.apis.paths.api_invoices import ApiInvoices
from belvo_client.apis.paths.api_invoices_id import ApiInvoicesId
from belvo_client.apis.paths.api_tax_returns import ApiTaxReturns
from belvo_client.apis.paths.api_tax_returns_id import ApiTaxReturnsId
from belvo_client.apis.paths.api_tax_status import ApiTaxStatus
from belvo_client.apis.paths.api_tax_status_id import ApiTaxStatusId
from belvo_client.apis.paths.api_tax_compliance_status import ApiTaxComplianceStatus
from belvo_client.apis.paths.api_tax_compliance_status_id import ApiTaxComplianceStatusId
from belvo_client.apis.paths.api_incomes import ApiIncomes
from belvo_client.apis.paths.api_incomes_id import ApiIncomesId
from belvo_client.apis.paths.api_recurring_expenses import ApiRecurringExpenses
from belvo_client.apis.paths.api_recurring_expenses_id import ApiRecurringExpensesId
from belvo_client.apis.paths.investments_portfolios import InvestmentsPortfolios
from belvo_client.apis.paths.investments_portfolios_id import InvestmentsPortfoliosId
from belvo_client.apis.paths.receivables_transactions import ReceivablesTransactions
from belvo_client.apis.paths.receivables_transactions_id import ReceivablesTransactionsId
from belvo_client.apis.paths.api_risk_insights import ApiRiskInsights
from belvo_client.apis.paths.api_risk_insights_id import ApiRiskInsightsId
from belvo_client.apis.paths.api_tax_retentions import ApiTaxRetentions
from belvo_client.apis.paths.api_tax_retentions_id import ApiTaxRetentionsId
from belvo_client.apis.paths.api_tax_declarations import ApiTaxDeclarations
from belvo_client.apis.paths.api_tax_declarations_id import ApiTaxDeclarationsId
from belvo_client.apis.paths.api_employment_records import ApiEmploymentRecords
from belvo_client.apis.paths.api_employment_records_id import ApiEmploymentRecordsId
from belvo_client.apis.paths.api_enrich_incomes import ApiEnrichIncomes
from belvo_client.apis.paths.api_categorization import ApiCategorization
from belvo_client.apis.paths.payments_secret_keys import PaymentsSecretKeys
from belvo_client.apis.paths.payments_institutions import PaymentsInstitutions
from belvo_client.apis.paths.payments_institutions_id import PaymentsInstitutionsId
from belvo_client.apis.paths.payments_customers import PaymentsCustomers
from belvo_client.apis.paths.payments_customers_id import PaymentsCustomersId
from belvo_client.apis.paths.payments_bank_accounts import PaymentsBankAccounts
from belvo_client.apis.paths.payments_bank_accounts_id import PaymentsBankAccountsId
from belvo_client.apis.paths.payments_payment_links import PaymentsPaymentLinks
from belvo_client.apis.paths.payments_payment_links_access_token import PaymentsPaymentLinksAccessToken
from belvo_client.apis.paths.payments_payment_intents import PaymentsPaymentIntents
from belvo_client.apis.paths.payments_payment_intents_id import PaymentsPaymentIntentsId
from belvo_client.apis.paths.payments_transactions import PaymentsTransactions
from belvo_client.apis.paths.payments_transactions_id import PaymentsTransactionsId

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.API_LINKS: ApiLinks,
        PathValues.API_LINKS_ID: ApiLinksId,
        PathValues.API_ACCOUNTS: ApiAccounts,
        PathValues.API_ACCOUNTS_ID: ApiAccountsId,
        PathValues.API_TRANSACTIONS: ApiTransactions,
        PathValues.API_TRANSACTIONS_ID: ApiTransactionsId,
        PathValues.API_BALANCES: ApiBalances,
        PathValues.API_BALANCES_ID: ApiBalancesId,
        PathValues.API_INSTITUTIONS: ApiInstitutions,
        PathValues.API_INSTITUTIONS_ID: ApiInstitutionsId,
        PathValues.API_OWNERS: ApiOwners,
        PathValues.API_OWNERS_ID: ApiOwnersId,
        PathValues.API_INVOICES: ApiInvoices,
        PathValues.API_INVOICES_ID: ApiInvoicesId,
        PathValues.API_TAXRETURNS: ApiTaxReturns,
        PathValues.API_TAXRETURNS_ID: ApiTaxReturnsId,
        PathValues.API_TAXSTATUS: ApiTaxStatus,
        PathValues.API_TAXSTATUS_ID: ApiTaxStatusId,
        PathValues.API_TAXCOMPLIANCESTATUS: ApiTaxComplianceStatus,
        PathValues.API_TAXCOMPLIANCESTATUS_ID: ApiTaxComplianceStatusId,
        PathValues.API_INCOMES: ApiIncomes,
        PathValues.API_INCOMES_ID: ApiIncomesId,
        PathValues.API_RECURRINGEXPENSES: ApiRecurringExpenses,
        PathValues.API_RECURRINGEXPENSES_ID: ApiRecurringExpensesId,
        PathValues.INVESTMENTS_PORTFOLIOS: InvestmentsPortfolios,
        PathValues.INVESTMENTS_PORTFOLIOS_ID: InvestmentsPortfoliosId,
        PathValues.RECEIVABLES_TRANSACTIONS: ReceivablesTransactions,
        PathValues.RECEIVABLES_TRANSACTIONS_ID: ReceivablesTransactionsId,
        PathValues.API_RISKINSIGHTS: ApiRiskInsights,
        PathValues.API_RISKINSIGHTS_ID: ApiRiskInsightsId,
        PathValues.API_TAXRETENTIONS: ApiTaxRetentions,
        PathValues.API_TAXRETENTIONS_ID: ApiTaxRetentionsId,
        PathValues.API_TAXDECLARATIONS: ApiTaxDeclarations,
        PathValues.API_TAXDECLARATIONS_ID: ApiTaxDeclarationsId,
        PathValues.API_EMPLOYMENTRECORDS: ApiEmploymentRecords,
        PathValues.API_EMPLOYMENTRECORDS_ID: ApiEmploymentRecordsId,
        PathValues.API_ENRICH_INCOMES: ApiEnrichIncomes,
        PathValues.API_CATEGORIZATION: ApiCategorization,
        PathValues.PAYMENTS_SECRETKEYS: PaymentsSecretKeys,
        PathValues.PAYMENTS_INSTITUTIONS: PaymentsInstitutions,
        PathValues.PAYMENTS_INSTITUTIONS_ID: PaymentsInstitutionsId,
        PathValues.PAYMENTS_CUSTOMERS: PaymentsCustomers,
        PathValues.PAYMENTS_CUSTOMERS_ID: PaymentsCustomersId,
        PathValues.PAYMENTS_BANKACCOUNTS: PaymentsBankAccounts,
        PathValues.PAYMENTS_BANKACCOUNTS_ID: PaymentsBankAccountsId,
        PathValues.PAYMENTS_PAYMENTLINKS: PaymentsPaymentLinks,
        PathValues.PAYMENTS_PAYMENTLINKS_ACCESS_TOKEN: PaymentsPaymentLinksAccessToken,
        PathValues.PAYMENTS_PAYMENTINTENTS: PaymentsPaymentIntents,
        PathValues.PAYMENTS_PAYMENTINTENTS_ID: PaymentsPaymentIntentsId,
        PathValues.PAYMENTS_TRANSACTIONS: PaymentsTransactions,
        PathValues.PAYMENTS_TRANSACTIONS_ID: PaymentsTransactionsId,
    }
)

path_to_api = PathToApi(
    {
        PathValues.API_LINKS: ApiLinks,
        PathValues.API_LINKS_ID: ApiLinksId,
        PathValues.API_ACCOUNTS: ApiAccounts,
        PathValues.API_ACCOUNTS_ID: ApiAccountsId,
        PathValues.API_TRANSACTIONS: ApiTransactions,
        PathValues.API_TRANSACTIONS_ID: ApiTransactionsId,
        PathValues.API_BALANCES: ApiBalances,
        PathValues.API_BALANCES_ID: ApiBalancesId,
        PathValues.API_INSTITUTIONS: ApiInstitutions,
        PathValues.API_INSTITUTIONS_ID: ApiInstitutionsId,
        PathValues.API_OWNERS: ApiOwners,
        PathValues.API_OWNERS_ID: ApiOwnersId,
        PathValues.API_INVOICES: ApiInvoices,
        PathValues.API_INVOICES_ID: ApiInvoicesId,
        PathValues.API_TAXRETURNS: ApiTaxReturns,
        PathValues.API_TAXRETURNS_ID: ApiTaxReturnsId,
        PathValues.API_TAXSTATUS: ApiTaxStatus,
        PathValues.API_TAXSTATUS_ID: ApiTaxStatusId,
        PathValues.API_TAXCOMPLIANCESTATUS: ApiTaxComplianceStatus,
        PathValues.API_TAXCOMPLIANCESTATUS_ID: ApiTaxComplianceStatusId,
        PathValues.API_INCOMES: ApiIncomes,
        PathValues.API_INCOMES_ID: ApiIncomesId,
        PathValues.API_RECURRINGEXPENSES: ApiRecurringExpenses,
        PathValues.API_RECURRINGEXPENSES_ID: ApiRecurringExpensesId,
        PathValues.INVESTMENTS_PORTFOLIOS: InvestmentsPortfolios,
        PathValues.INVESTMENTS_PORTFOLIOS_ID: InvestmentsPortfoliosId,
        PathValues.RECEIVABLES_TRANSACTIONS: ReceivablesTransactions,
        PathValues.RECEIVABLES_TRANSACTIONS_ID: ReceivablesTransactionsId,
        PathValues.API_RISKINSIGHTS: ApiRiskInsights,
        PathValues.API_RISKINSIGHTS_ID: ApiRiskInsightsId,
        PathValues.API_TAXRETENTIONS: ApiTaxRetentions,
        PathValues.API_TAXRETENTIONS_ID: ApiTaxRetentionsId,
        PathValues.API_TAXDECLARATIONS: ApiTaxDeclarations,
        PathValues.API_TAXDECLARATIONS_ID: ApiTaxDeclarationsId,
        PathValues.API_EMPLOYMENTRECORDS: ApiEmploymentRecords,
        PathValues.API_EMPLOYMENTRECORDS_ID: ApiEmploymentRecordsId,
        PathValues.API_ENRICH_INCOMES: ApiEnrichIncomes,
        PathValues.API_CATEGORIZATION: ApiCategorization,
        PathValues.PAYMENTS_SECRETKEYS: PaymentsSecretKeys,
        PathValues.PAYMENTS_INSTITUTIONS: PaymentsInstitutions,
        PathValues.PAYMENTS_INSTITUTIONS_ID: PaymentsInstitutionsId,
        PathValues.PAYMENTS_CUSTOMERS: PaymentsCustomers,
        PathValues.PAYMENTS_CUSTOMERS_ID: PaymentsCustomersId,
        PathValues.PAYMENTS_BANKACCOUNTS: PaymentsBankAccounts,
        PathValues.PAYMENTS_BANKACCOUNTS_ID: PaymentsBankAccountsId,
        PathValues.PAYMENTS_PAYMENTLINKS: PaymentsPaymentLinks,
        PathValues.PAYMENTS_PAYMENTLINKS_ACCESS_TOKEN: PaymentsPaymentLinksAccessToken,
        PathValues.PAYMENTS_PAYMENTINTENTS: PaymentsPaymentIntents,
        PathValues.PAYMENTS_PAYMENTINTENTS_ID: PaymentsPaymentIntentsId,
        PathValues.PAYMENTS_TRANSACTIONS: PaymentsTransactions,
        PathValues.PAYMENTS_TRANSACTIONS_ID: PaymentsTransactionsId,
    }
)
