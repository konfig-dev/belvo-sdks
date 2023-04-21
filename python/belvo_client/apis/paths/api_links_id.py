from belvo_client.paths.api_links_id.get import ApiForget
from belvo_client.paths.api_links_id.put import ApiForput
from belvo_client.paths.api_links_id.delete import ApiFordelete
from belvo_client.paths.api_links_id.patch import ApiForpatch


class ApiLinksId(
    ApiForget,
    ApiForput,
    ApiFordelete,
    ApiForpatch,
):
    pass
