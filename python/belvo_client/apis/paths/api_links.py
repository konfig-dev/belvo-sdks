from belvo_client.paths.api_links.get import ApiForget
from belvo_client.paths.api_links.post import ApiForpost
from belvo_client.paths.api_links.patch import ApiForpatch


class ApiLinks(
    ApiForget,
    ApiForpost,
    ApiForpatch,
):
    pass
