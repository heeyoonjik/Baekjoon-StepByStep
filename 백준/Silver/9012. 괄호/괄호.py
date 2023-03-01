for _ in range(int(input())):
  stack = []
  isVPS = True
  for characterSymbol in input():
    if characterSymbol == '(':
      stack.append(characterSymbol)
    else:
      if stack:
        stack.pop()
      else:
        isVPS = False
        break

  if stack:
    isVPS = False 

  print('YES' if isVPS else 'NO' )