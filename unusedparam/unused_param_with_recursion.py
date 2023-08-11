def completely_unused_param(p1, p2):
    return p1

def param_only_used_in_recursion(p1, p2):
    if p1:
        return param_only_used_in_recursion(p1[1:], p2)
    return p1

