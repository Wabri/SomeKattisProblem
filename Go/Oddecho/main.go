package main

import "fmt"

func main() {
	var index, indexes int8
	fmt.Scan(&indexes)

	for index = 1; index <= indexes; index++ {
		var element string
		fmt.Scan(&element)

		if index%2 == 1 {
			fmt.Printf("%s\n", element)
		}
	}
}
