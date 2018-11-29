def func(functionName):
    print("---func---1---")

    def func_in(*args, **Kwargs):
        print("---func_in---1---")
        functionName(*args, **Kwargs)
        print("---func_in---2---")

    print("---func---2---")

    return func_in


@func
def test(a, b):
    print("---test-a=%d, b=%d" % (a, b))


test(1, 2)
