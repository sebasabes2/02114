.text
li x1, 0x3000   # UART address

wait: 
lw x2, 4(x1)
nop
andi x2, x2, 2
beq x0, x2, wait

nop
nop

lw x2, 0(x1)
nop
sw x2, 0(x1)
beq x0, x0, wait
