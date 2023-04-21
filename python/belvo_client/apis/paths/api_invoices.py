from belvo_client.paths.api_invoices.get import ApiForget
from belvo_client.paths.api_invoices.post import ApiForpost
from belvo_client.paths.api_invoices.patch import ApiForpatch


class ApiInvoices(
    ApiForget,
    ApiForpost,
    ApiForpatch,
):
    pass
