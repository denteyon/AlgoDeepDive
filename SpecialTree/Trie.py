class Trie:
    def __init__(self):
        self.root = {}

    def insert(self, word: str) -> None:
        current_node = self.root
        for char in word:
            if not current_node.get(char):
                current_node[char] = {}
            current_node = current_node[char]
        current_node['#'] = True
            
    def search(self, word: str) -> bool:
        current_node = self.root
        for char in word:
            if current_node.get(char):
                current_node = current_node[char]
            else:
                return False
        return current_node.get('#')
        
    def startsWith(self, prefix: str) -> bool:
        current_node = self.root
        for char in prefix:
            if current_node.get(char):
                current_node = current_node[char]
            else:
                return False
        return True

trie = Trie()
trie.insert("love")
trie.insert("look")