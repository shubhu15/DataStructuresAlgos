# """
# This is HtmlParser's API interface.
# You should not implement it, or speculate about its implementation
# """
#class HtmlParser(object):
#    def getUrls(self, url):
#        """
#        :type url: str
#        :rtype List[str]
#        """

class Solution:
    def crawl(self, startUrl: str, htmlParser: 'HtmlParser') -> List[str]:
        def getHostName(url):
            return url.split('/')[2]
        que = deque()
        host = getHostName(startUrl)
        visited = set()
        visited.add(startUrl)
        que.append(startUrl)
        while que:
            url = que.popleft()
            for u in htmlParser.getUrls(url):
                if getHostName(u) == host and u not in visited:
                    que.append(u)
                    visited.add(u)
        

        

        return list(visited)
        
        