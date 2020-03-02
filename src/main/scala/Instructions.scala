import chisel3.util.BitPat

object Instructions {
  // Add/subtract
  def ADD       = BitPat("b011111???????????????0100001010?")
  def ADDC      = BitPat("b011111???????????????0000001010?")
  def ADDE      = BitPat("b011111???????????????0010001010?")
  def ADDI      = BitPat("b001110??????????????????????????")
  def ADDIC     = BitPat("b001100??????????????????????????")
  def ADDIC_DOT = BitPat("b001101??????????????????????????")
  def ADDIS     = BitPat("b001111??????????????????????????")
  def ADDME     = BitPat("b011111???????????????0011101010?")
  def ADDZE     = BitPat("b011111???????????????0011001010?")
  def SUBF      = BitPat("b011111???????????????0000101000?")
  def SUBFC     = BitPat("b011111???????????????0000001000?")
  def SUBFE     = BitPat("b011111???????????????0010001000?")
  def SUBFIC    = BitPat("b001000??????????????????????????")
  def SUBFME    = BitPat("b011111???????????????0011101000?")
  def SUBFZE    = BitPat("b011111???????????????0011001000?")
  def NEG       = BitPat("b011111???????????????0001101000?")

  // Logical
  def AND       = BitPat("b011111???????????????0000011100?")
  def ANDC      = BitPat("b011111???????????????0000111100?")
  def ANDI_DOT  = BitPat("b011100??????????????????????????")
  def ANDIS_DOT = BitPat("b011101??????????????????????????")
  def EQV       = BitPat("b011111???????????????0100011100?")
  def NAND      = BitPat("b011111???????????????0111011100?")
  def NOR       = BitPat("b011111???????????????0001111100?")
  def OR        = BitPat("b011111???????????????0110111100?")
  def ORC       = BitPat("b011111???????????????0110011100?")
  def ORI       = BitPat("b011000??????????????????????????")
  def ORIS      = BitPat("b011001??????????????????????????")
  def XOR       = BitPat("b011111???????????????0100111100?")
  def XORI      = BitPat("b011010??????????????????????????")
  def XORIS     = BitPat("b011011??????????????????????????")
  def EXTSB     = BitPat("b011111???????????????1110111010?")
  def EXTSH     = BitPat("b011111???????????????1110011010?")
  def EXTSW     = BitPat("b011111???????????????1111011010?")

  // Rotate/shift
  def RLDCL     = BitPat("b011110?????????????????????1000?")
  def RLDCR     = BitPat("b011110?????????????????????1001?")
  def RLDIC     = BitPat("b011110?????????????????????010??")
  def RLDICL    = BitPat("b011110?????????????????????000??")
  def RLDICR    = BitPat("b011110?????????????????????001??")
  def RLDIMI    = BitPat("b011110?????????????????????011??")
  def RLWIMI    = BitPat("b010100??????????????????????????")
  def RLWINM    = BitPat("b010101??????????????????????????")
  def RLWNM     = BitPat("b010111??????????????????????????")
  def SLD       = BitPat("b011111???????????????0000011011?")
  def SLW       = BitPat("b011111???????????????0000011000?")
  def SRAD      = BitPat("b011111???????????????1100011010?")
  def SRADI     = BitPat("b011111???????????????110011101??")
  def SRAW      = BitPat("b011111???????????????1100011000?")
  def SRAWI     = BitPat("b011111???????????????1100111000?")
  def SRD       = BitPat("b011111???????????????1000011011?")
  def SRW       = BitPat("b011111???????????????1000011000?")

  // Multiply
  def MULHD     = BitPat("b011111????????????????001001001?")
  def MULHDU    = BitPat("b011111????????????????000001001?")
  def MULHW     = BitPat("b011111????????????????001001011?")
  def MULHWU    = BitPat("b011111????????????????000001011?")
  def MULLD     = BitPat("b011111???????????????0011101001?")
  def MULLI     = BitPat("b000111??????????????????????????")
  def MULLW     = BitPat("b011111???????????????0011101011?")

  // Divide
  def DIVD      = BitPat("b011111???????????????0111101001?")
  def DIVDE     = BitPat("b011111???????????????0110101001?")
  def DIVDEU    = BitPat("b011111???????????????0110001001?")
  def DIVDU     = BitPat("b011111???????????????0111001001?")
  def DIVW      = BitPat("b011111???????????????0111101011?")
  def DIVWE     = BitPat("b011111???????????????0110101011?")
  def DIVWEU    = BitPat("b011111???????????????0110001011?")
  def DIVWU     = BitPat("b011111???????????????0111001011?")
  def MODSD     = BitPat("b011111???????????????1100001001?")
  def MODSW     = BitPat("b011111???????????????1100001011?")
  def MODUD     = BitPat("b011111???????????????0100001001?")
  def MODUW     = BitPat("b011111???????????????0100001011?")

  // Load/store
  def LBARX     = BitPat("b011111???????????????0000110100?")
  def LBZ       = BitPat("b100010??????????????????????????")
  def LBZCIX    = BitPat("b011111???????????????1101010101?")
  def LBZU      = BitPat("b100011??????????????????????????")
  def LBZUX     = BitPat("b011111???????????????0001110111?")
  def LBZX      = BitPat("b011111???????????????0001010111?")
  def LD        = BitPat("b111010????????????????????????00")
  def LDARX     = BitPat("b011111???????????????0001010100?")
  def LDBRX     = BitPat("b011111???????????????1000010100?")
  def LDCIX     = BitPat("b011111???????????????1101110101?")
  def LDU       = BitPat("b111010????????????????????????01")
  def LDUX      = BitPat("b011111???????????????0000110101?")
  def LDX       = BitPat("b011111???????????????0000010101?")
  def LHA       = BitPat("b101010??????????????????????????")
  def LHARX     = BitPat("b011111???????????????0001110100?")
  def LHAU      = BitPat("b101011??????????????????????????")
  def LHAUX     = BitPat("b011111???????????????0101110111?")
  def LHAX      = BitPat("b011111???????????????0101010111?")
  def LHBRX     = BitPat("b011111???????????????1100010110?")
  def LHZ       = BitPat("b101000??????????????????????????")
  def LHZCIX    = BitPat("b011111???????????????1100110101?")
  def LHZU      = BitPat("b101001??????????????????????????")
  def LHZUX     = BitPat("b011111???????????????0100110111?")
  def LHZX      = BitPat("b011111???????????????0100010111?")
  def LWA       = BitPat("b111010????????????????????????10")
  def LWARX     = BitPat("b011111???????????????0000010100?")
  def LWAUX     = BitPat("b011111???????????????0101110101?")
  def LWAX      = BitPat("b011111???????????????0101010101?")
  def LWBRX     = BitPat("b011111???????????????1000010110?")
  def LWZ       = BitPat("b100000??????????????????????????")
  def LWZCIX    = BitPat("b011111???????????????1100010101?")
  def LWZU      = BitPat("b100001??????????????????????????")
  def LWZUX     = BitPat("b011111???????????????0000110111?")
  def LWZX      = BitPat("b011111???????????????0000010111?")
  def STB       = BitPat("b100110??????????????????????????")
  def STBCIX    = BitPat("b011111???????????????1111010101?")
  def STBCX_DOT = BitPat("b011111???????????????10101101101")
  def STBU      = BitPat("b100111??????????????????????????")
  def STBUX     = BitPat("b011111???????????????0011110111?")
  def STBX      = BitPat("b011111???????????????0011010111?")
  def STD       = BitPat("b111110????????????????????????00")
  def STDBRX    = BitPat("b011111???????????????1010010100?")
  def STDCIX    = BitPat("b011111???????????????1111110101?")
  def STDCX_DOT = BitPat("b011111???????????????00110101101")
  def STDU      = BitPat("b111110????????????????????????01")
  def STDUX     = BitPat("b011111???????????????0010110101?")
  def STDX      = BitPat("b011111???????????????0010010101?")
  def STH       = BitPat("b101100??????????????????????????")
  def STHBRX    = BitPat("b011111???????????????1110010110?")
  def STHCIX    = BitPat("b011111???????????????1110110101?")
  def STHCX_DOT = BitPat("b011111???????????????10110101101")
  def STHU      = BitPat("b101101??????????????????????????")
  def STHUX     = BitPat("b011111???????????????0110110111?")
  def STHX      = BitPat("b011111???????????????0110010111?")
  def STW       = BitPat("b100100??????????????????????????")
  def STWBRX    = BitPat("b011111???????????????1010010110?")
  def STWCIX    = BitPat("b011111???????????????1110010101?")
  def STWCX_DOT = BitPat("b011111???????????????00100101101")
  def STWU      = BitPat("b100101??????????????????????????")
  def STWUX     = BitPat("b011111???????????????0010110111?")
  def STWX      = BitPat("b011111???????????????0010010111?")

  // Branch and trap
  def B         = BitPat("b010010????????????????????????0?")
  def BC        = BitPat("b010000????????????????????????0?")
  def BCCTR     = BitPat("b010011???????????????1000010000?")
  def BCLR      = BitPat("b010011???????????????0000010000?")

  // Compare
  def CMPD      = BitPat("b011111????1??????????0000000000?")
  def CMPW      = BitPat("b011111????0??????????0000000000?")
  def CMPDI     = BitPat("b001011????1?????????????????????")
  def CMPWI     = BitPat("b001011????0?????????????????????")
  def CMPLD     = BitPat("b011111????1??????????0000100000?")
  def CMPLW     = BitPat("b011111????0??????????0000100000?")
  def CMPLDI    = BitPat("b001010????1?????????????????????")
  def CMPLWI    = BitPat("b001010????0?????????????????????")

  // CR
  def MFCR      = BitPat("b011111?????0?????????0000010011?")
  def MFOCRF    = BitPat("b011111?????1?????????0000010011?")
  def MTCRF     = BitPat("b011111?????0?????????0010010000?")
  def MTOCRF    = BitPat("b011111?????1?????????0010010000?")
  def MCRF      = BitPat("b010011???????????????0000000000?")

  // SPR read/write
  def MFSPR     = BitPat("b011111???????????????0101010011?")
  def MTSPR     = BitPat("b011111???????????????0111010011?")

  // Cache control
  def DCBF      = BitPat("b011111???????????????0001010110?")
  def DCBST     = BitPat("b011111???????????????0000110110?")
  def DCBT      = BitPat("b011111???????????????0100010110?")
  def DCBTST    = BitPat("b011111???????????????0011110110?")
  def ICBI      = BitPat("b011111???????????????1111010110?")
  def ICBT      = BitPat("b011111???????????????0000010110?")
  def ISYNC     = BitPat("b010011???????????????0010010110?")
  def SYNC      = BitPat("b011111???????????????1001010110?")

  // Population count
  def POPCNTB   = BitPat("b011111???????????????0001111010?")
  def POPCNTD   = BitPat("b011111???????????????0111111010?")
  def POPCNTW   = BitPat("b011111???????????????0101111010?")

  // Count zeroes
  def CNTLZD    = BitPat("b011111???????????????0000111010?")
  def CNTLZW    = BitPat("b011111???????????????0000011010?")
  def CNTTZD    = BitPat("b011111???????????????1000111010?")
  def CNTTZW    = BitPat("b011111???????????????1000011010?")

  // Not currently implemented

  // CR logical
  //def CRAND     = BitPat("b010011???????????????0100000001?")
  //def CRANDC    = BitPat("b010011???????????????0010000001?")
  //def CREQV     = BitPat("b010011???????????????0100100001?")
  //def CRNAND    = BitPat("b010011???????????????0011100001?")
  //def CRNOR     = BitPat("b010011???????????????0000100001?")
  //def CROR      = BitPat("b010011???????????????0111000001?")
  //def CRORC     = BitPat("b010011???????????????0110100001?")
  //def CRXOR     = BitPat("b010011???????????????0011000001?")

  // This is treated as a NOP for now to allow the endian switch code to work
  def TDI       = BitPat("b000010??????????????????????????")
  //def TD        = BitPat("b011111???????????????0001000100?")
  //def TW        = BitPat("b011111???????????????0000000100?")
  //def TWI       = BitPat("b000011??????????????????????????")

  //def BA        = BitPat("b010010????????????????????????1?")
  //def BCA       = BitPat("b010000????????????????????????1?")
  //def BCTAR     = BitPat("b010011???????????????1000110000?") // 2.07

  //def DCBZ      = BitPat("b011111???????????????1111110110?")

  //def ISEL      = BitPat("b011111????????????????????01111?") // 2.03

  //def PRTYD     = BitPat("b011111???????????????0010111010?") // 2.05
  //def PRTYW     = BitPat("b011111???????????????0010011010?") // 2.05

  //def CMPB      = BitPat("b011111???????????????0111111100?") // 2.05

  // v3.0 Instructions
  //def MADDHD    = BitPat("b000100????????????????????110000") // 3.0
  //def MADDHDU   = BitPat("b000100????????????????????110001") // 3.0
  //def MADDLD    = BitPat("b000100????????????????????110011") // 3.0
  //def ADDEX     = BitPat("b011111?????????????????10101010?") // 3.0
  //def BPERM     = BitPat("b011111???????????????0011111100?") // 3.0
  //def SETB      = BitPat("b011111???????????????0010000000?") // 3.0
  //def CMPEQB    = BitPat("b011111???????????????0011100000?") // 3.0
  //def CMPRB     = BitPat("b011111???????????????0011000000?") // 3.0
  //def ADDPCIS   = BitPat("b010011????????????????????00010?") // 3.0
  //def DARN      = BitPat("b011111???????????????1011110011?") // 3.0
  //def MCRXRX    = BitPat("b011111???????????????1001000000?") // 3.0
  //def EXTSWSLI  = BitPat("b011111???????????????110111101??") // 3.0
}
