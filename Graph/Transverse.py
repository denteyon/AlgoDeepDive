# "PM" -> "ddd#urr#"

def alphabetboard(s):
    start = 1
    path = ""
    for char in s:
        char_ord = ord(char) - 64 # 16
        row_start = start // 5 # 0
        row_end = char_ord // 5 # 3
        col_start = start % 5 # 1
        col_end = char_ord % 5 # 1

        row_diff = row_end - row_start # 3
        col_diff = col_end - col_start # 0

        ud = "d" if row_diff > 0 else "u"
        lr = "r" if col_diff > 0 else "l"

        path += ud * abs(row_diff)
        path += lr * abs(col_diff)
        path += "#"
        start = char_ord
    print(path[:-1])
    return path

alphabetboard("AZ")
