def is_pangram(s):
    alphabet = set()
    for char in s:
        char = char.lower()
        if char.isalpha() and char not in alphabet:
            alphabet.add(char)
    print(alphabet)
    return len(alphabet) == 26

print(is_pangram('Xylophones were the main instrumentation in the zappy musical meeting between the charismatic koalas!'))