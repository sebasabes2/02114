#!/bin/sh

src="$1"
out="${1%.*}.out"
riscv64-linux-gnu-gcc -march=rv32i -mabi=ilp32 -static -nostdlib -nostartfiles -O2 $@ -o $out -Tlinker.ld -L. -lprocessinator -lgcc
