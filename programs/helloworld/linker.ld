
OUTPUT_ARCH( "riscv" )

SECTIONS
{
  . = 0x00000000;
  .text : {
    *(.text) 
  }
  . = 0x00001000;
  .data : { *(.data) }
  .rodata : { *(.rodata) }
  .bss : { *(.bss) }
}
