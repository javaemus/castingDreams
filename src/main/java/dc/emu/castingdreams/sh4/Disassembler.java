package dc.emu.castingdreams.sh4;

/**
 *
 * @author shadow
 */
public class Disassembler {

    private static final int RM(int opcode) {
        return ((opcode & 0x00f0) >> 4);
    }

    private static final int RN(int opcode) {
        return ((opcode & 0x0f00) >> 8);
    }

    private static final int IMM(int opcode) {
        return (opcode & 0x00ff);
    }

    private static final int DISP(int opcode) {
        return (opcode & 0x000f);
    }

    public String disasm(int pc, int opcode) {
        switch ((opcode >>> 12) & 0xf) {
            case 0:
                switch ((opcode) & 0xf) {
                    case 2:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                //STCSR(opcode);
                                return String.format("STCSR ???");
                            case 1:
                                //STCGBR(opcode);
                                return String.format("STCGBR ???");
                            case 2:
                                //STCVBR(opcode);
                                return String.format("STCVBR ???");
                            case 3:
                                //STCSSR(opcode);
                                return String.format("STCSSR ???");
                            case 4:
                                //STCSPC(opcode);
                                return String.format("STCSPC ???");
                            case 8:
                                //STCRBANK(opcode);
                                return String.format("STCRBANK ???");
                            case 9:
                                //STCRBANK(opcode);
                                return String.format("STCRBANK ???");
                            case 10:
                                //STCRBANK(opcode);
                                return String.format("STCRBANK ???");
                            case 11:
                                //STCRBANK(opcode);
                                return String.format("STCRBANK ???");
                            case 12:
                                //STCRBANK(opcode);
                                return String.format("STCRBANK ???");
                            case 13:
                                //STCRBANK(opcode);
                                return String.format("STCRBANK ???");
                            case 14:
                                //STCRBANK(opcode);
                                return String.format("STCRBANK ???");
                            case 15:
                                //STCRBANK(opcode);
                                return String.format("STCRBANK ???");
                            default:
                                return String.format("???");
                        }

                    case 3:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                //BSRF(opcode);
                                return String.format("???");
                            case 2:
                                //BRAF(opcode);
                                return String.format("???");
                            case 8:
                                return String.format("pref @R%d", RN(opcode));
                            case 9:
                                //OCBI(opcode);
                                return String.format("???");
                            case 10:
                                //OCBP(opcode);
                                return String.format("???");
                            case 11:
                                //OCBWB(opcode);
                                return String.format("???");
                            case 12:
                                //MOVCAL(opcode);
                                return String.format("MOVCAL ???");
                            default:
                                return String.format("???");
                        }

                    case 4:
                        //MOVBS0(opcode);
                        return String.format("MOVBS0 ???");
                    case 5:
                        //MOVWS0(opcode);
                        return String.format("MOVWS0 ???");
                    case 6:
                        //MOVLS0(opcode);
                        return String.format("MOVLS0 ???");
                    case 7:
                        //MULL(opcode);
                        return String.format("MULL ???");

                    case 8:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                //CLRT(opcode);
                                return String.format("???");
                            case 1:
                                //SETT(opcode);
                                return String.format("???");
                            case 2:
                                //CLRMAC(opcode);
                                return String.format("???");
                            case 3:
                                //CLRS(opcode);
                                return String.format("???");
                            case 4:
                                //SETS(opcode);
                                return String.format("???");
                            default:
                                return String.format("???");
                        }

                    case 9:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                return String.format("nop");
                            case 1:
                                //DIV0U(opcode);
                                return String.format("???");
                            case 2:
                                //MOVT(opcode);
                                return String.format("MOVT ???");
                            default:
                                return String.format("???");
                        }

                    case 10:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                //STSMACH(opcode);
                                return String.format("STSMACH ???");
                            case 1:
                                return String.format("sts MACL, R%d", RN(opcode));
                            case 2:
                                //STSPR(opcode);
                                return String.format("???");
                            case 3:
                                //STCSGR(opcode);
                                return String.format("???");
                            case 5:
                                //STSFPUL(opcode);
                                return String.format("???");
                            case 6:
                                //STSFPSCR(opcode);
                                return String.format("???");
                            case 15:
                                //STCDBR(opcode);
                                return String.format("???");
                            default:
                                return String.format("???");
                        }

                    case 11:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                // RTS(opcode);
                                return String.format("RTS ???");
                            case 1:
                                //SLEEP(opcode);
                                return String.format("SLEEP ???");
                            case 2:
                                //RTE(opcode);
                                return String.format("RTE ???");
                            default:
                                return String.format("???");
                        }

                    case 12:
                        //MOVBL0(opcode);
                        return String.format("MOVBL0 ???");
                    case 13:
                        //MOVWL0(opcode);
                        return String.format("MOVWL0 ???");
                    case 14:
                        //MOVLL0(opcode);
                        return String.format("MOVLL0 ???");
                    case 15:
                        //MACL(opcode);
                        return String.format("???");
                    default:
                        return String.format("???");
                }

            case 1:
                return String.format("mov.l R%d, @(%d, R%d)",RM(opcode),DISP(opcode),RN(opcode));

            case 2:
                switch ((opcode) & 0xf) {
                    case 0:
                        //MOVBS(opcode);
                        return String.format("MOVBS ???");
                    case 1:
                        //MOVWS(opcode);
                        return String.format("MOVWS ???");
                    case 2:
                        //MOVLS(opcode);
                        return String.format("MOVLS ???");
                    case 4:
                        //MOVBM(opcode);
                        return String.format("MOVBM ???");
                    case 5:
                        //MOVWM(opcode);
                        return String.format("MOVWM ???");
                    case 6:
                        //MOVLM(opcode);
                        return String.format("MOVLM ???");
                    case 7:
                        //DIV0S(opcode);
                        return String.format("DIV0S ???");
                    case 8:
                        return String.format("tst R%d, R%d", RM(opcode), RN(opcode));
                    case 9:
                        return String.format("and R%d, R%d", RM(opcode), RN(opcode));
                    case 10:
                        return String.format("xor R%d, R%d", RM(opcode), RN(opcode));
                    case 11:
                        return String.format("or R%d, R%d", RM(opcode), RN(opcode));
                    case 12:
                        //CMPSTR(opcode);
                        return String.format("???");
                    case 13:
                        //XTRCT(opcode);
                        return String.format("???");
                    case 14:
                        return String.format("mulu.w R%d, R%d", RM(opcode), RN(opcode));
                    case 15:
                        // MULSW(opcode);
                        return String.format("MULSW ???");
                    default:
                        return String.format("???");
                }

            case 3:
                switch ((opcode) & 0xf) {
                    case 0:
                        //CMPEQ(opcode);
                        return String.format("CMPEQ ???");
                    case 2:
                        //CMPHS(opcode);
                        return String.format("CMPHS ???");
                    case 3:
                        //CMPGE(opcode);
                        return String.format("???");
                    case 4:
                        //DIV1(opcode);
                        return String.format("???");
                    case 5:
                        //DMULU(opcode);
                        return String.format("???");
                    case 6:
                        //CMPHI(opcode);
                        return String.format("???");
                    case 7:
                        //CMPGT(opcode);
                        return String.format("???");
                    case 8:
                        //SUB(opcode);
                        return String.format("???");
                    case 10:
                        //SUBC(opcode);
                        return String.format("???");
                    case 11:
                        //SUBV(opcode);
                        return String.format("???");
                    case 12:
                        //ADD(opcode);
                        return String.format("???");
                    case 13:
                        //DMULS(opcode);
                        return String.format("???");
                    case 14:
                        //ADDC(opcode);
                        return String.format("???");
                    case 15:
                        //ADDV(opcode);
                        return String.format("???");
                    default:
                        return String.format("???");
                }

            case 4:
                switch ((opcode) & 0xf) {
                    case 0:
                        switch ((opcode >> 4) & 0xf) {
                            case 0:
                                //SHLL(opcode);
                                return String.format("???");
                            case 1:
                                //DT(opcode);
                                return String.format("???");
                            case 2:
                                //SHAL(opcode);
                                return String.format("???");
                            default:
                                return String.format("???");
                        }

                    case 1:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                //SHLR(opcode);
                                return String.format("???");
                            case 1:
                                //CMPPZ(opcode);
                                return String.format("???");
                            case 2:
                                return String.format("shar R%d", RN(opcode));
                            default:
                                return String.format("???");
                        }

                    case 2:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                //STSMMACH(opcode);
                                return String.format("???");
                            case 1:
                                //STSMMACL(opcode);
                                return String.format("???");
                            case 2:
                                //STSMPR(opcode);
                                return String.format("???");
                            case 5:
                                //STSMFPUL(opcode);
                                return String.format("???");
                            case 6:
                                //STSMFPSCR(opcode);
                                return String.format("???");
                            default:
                                return String.format("???");
                        }

                    case 3:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                //STCMSR(opcode);
                                return String.format("???");
                            case 1:
                                //STCMGBR(opcode);
                                return String.format("???");
                            case 2:
                                //STCMVBR(opcode);
                                return String.format("???");
                            case 3:
                                //STCMSSR(opcode);
                                return String.format("???");
                            case 4:
                                //STCMSPC(opcode);
                                return String.format("???");
                            case 8:
                                //STCMRBANK(opcode);
                                return String.format("???");
                            case 9:
                                //STCMRBANK(opcode);
                                return String.format("???");
                            case 10:
                                //STCMRBANK(opcode);
                                return String.format("???");
                            case 11:
                                //STCMRBANK(opcode);
                                return String.format("???");
                            case 12:
                                //STCMRBANK(opcode);
                                return String.format("???");
                            case 13:
                                //STCMRBANK(opcode);
                                return String.format("???");
                            case 14:
                                //STCMRBANK(opcode);
                                return String.format("???");
                            case 15:
                                //STCMRBANK(opcode);
                                return String.format("???");
                            default:
                                return String.format("???");
                        }

                    case 4:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                //ROTL(opcode);
                                return String.format("???");
                            case 2:
                                //ROTCL(opcode);
                                return String.format("???");
                            default:
                                return String.format("???");
                        }

                    case 5:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                return String.format("rotr R%d", RN(opcode));
                            case 1:
                                //CMPPL(opcode);
                                return String.format("???");
                            case 2:
                                //ROTCR(opcode);
                                return String.format("???");
                            default:
                                return String.format("???");
                        }

                    case 6:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                //LDSMMACH(opcode);
                                return String.format("???");
                            case 1:
                                //LDSMMACL(opcode);
                                return String.format("???");
                            case 2:
                                //LDSMPR(opcode);
                                return String.format("???");
                            case 5:
                                //LDSMFPUL(opcode);
                                return String.format("???");
                            case 6:
                                //LDSMFPSCR(opcode);
                                return String.format("???");
                            case 15:
                                //LDCMDBR(opcode);
                                return String.format("???");
                            default:
                                return String.format("???");
                        }

                    case 7:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                //LDCMSR(opcode);
                                return String.format("???");
                            case 1:
                                //LDCMGBR(opcode);
                                return String.format("???");
                            case 2:
                                //LDCMVBR(opcode);
                                return String.format("???");
                            case 3:
                                //LDCMSSR(opcode);
                                return String.format("???");
                            case 4:
                                //LDCMSPC(opcode);
                                return String.format("???");
                            case 8:
                                //LDCMRBANK(opcode);
                                return String.format("???");
                            case 9:
                                //LDCMRBANK(opcode);
                                return String.format("???");
                            case 10:
                                //LDCMRBANK(opcode);
                                return String.format("???");
                            case 11:
                                //LDCMRBANK(opcode);
                                return String.format("???");
                            case 12:
                                //LDCMRBANK(opcode);
                                return String.format("???");
                            case 13:
                                //LDCMRBANK(opcode);
                                return String.format("???");
                            case 14:
                                //LDCMRBANK(opcode);
                                return String.format("???");
                            case 15:
                                //LDCMRBANK(opcode);
                                return String.format("???");
                            default:
                                return String.format("???");
                        }

                    case 8:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                //SHLL2(opcode);
                                return String.format("???");
                            case 1:
                                return String.format("shll8 R%d", RN(opcode));
                            case 2:
                                return String.format("shll16 R%d", RN(opcode));
                            default:
                                return String.format("???");
                        }

                    case 9:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                return String.format("shlr2 R%d", RN(opcode));
                            case 1:
                                //SHLR8(opcode);
                                return String.format("???");
                            case 2:
                                //SHLR16(opcode);
                                return String.format("???");
                            default:
                                return String.format("???");
                        }

                    case 10:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                //LDSMACH(opcode);
                                return String.format("???");
                            case 1:
                                //LDSMACL(opcode);
                                return String.format("???");
                            case 2:
                                //LDSPR(opcode);
                                return String.format("???");
                            case 5:
                                //LDSFPUL(opcode);
                                return String.format("???");
                            case 6:
                                //LDSFPSCR(opcode);
                                return String.format("???");
                            case 15:
                                //LDCDBR(opcode);
                                return String.format("???");
                            default:
                                return String.format("???");
                        }

                    case 11:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                //JSR(opcode);
                                return String.format("???");
                            case 1:
                                //TAS(opcode);
                                return String.format("???");
                            case 2:
                                return String.format("jmp @R%d", RN(opcode));
                            default:
                                return String.format("???");
                        }

                    case 12:
                        //SHAD(opcode);
                        return String.format("???");
                    case 13:
                        //SHLD(opcode);
                        return String.format("???");

                    case 14:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                //LDCSR(opcode);
                                return String.format("???");
                            case 1:
                                //LDCGBR(opcode);
                                return String.format("???");
                            case 2:
                                //LDCVBR(opcode);
                                return String.format("???");
                            case 3:
                                //LDCSSR(opcode);
                                return String.format("???");
                            case 4:
                                //LDCSPC(opcode);
                                return String.format("???");
                            case 8:
                                //LDCRBANK(opcode);
                                return String.format("???");
                            case 9:
                                //LDCRBANK(opcode);
                                return String.format("???");
                            case 10:
                                //LDCRBANK(opcode);
                                return String.format("???");
                            case 11:
                                //LDCRBANK(opcode);
                                return String.format("???");
                            case 12:
                                // LDCRBANK(opcode);
                                return String.format("???");
                            case 13:
                                //LDCRBANK(opcode);
                                return String.format("???");
                            case 14:
                                //LDCRBANK(opcode);
                                return String.format("???");
                            case 15:
                                //LDCRBANK(opcode);
                                return String.format("???");
                            default:
                                return String.format("???");
                        }

                    case 15:
                        //MACW(opcode);
                        return String.format("???");
                    default:
                        return String.format("???");
                }

            case 5:
                return String.format("mov.l @(%d, R%d), R%d",DISP(opcode),RM(opcode),RN(opcode));

            case 6:
                switch ((opcode) & 0xf) {
                    case 0:
                        //MOVBL(opcode);
                        return String.format("MOVBL ???");
                    case 1:
                        //MOVWL(opcode);
                        return String.format("MOVWL ???");
                    case 2:
                        //MOVLL(opcode);
                        return String.format("MOVLL ???");
                    case 3:
                        return String.format("mov R%d, R%d", RM(opcode), RN(opcode));
                    case 4:
                        //MOVBP(opcode);
                        return String.format("MOVBP ???");
                    case 5:
                        //MOVWP(opcode);
                        return String.format("MOVWP ???");
                    case 6:
                        //MOVLP(opcode);
                        return String.format("MOVLP ???");
                    case 7:
                        //NOT(opcode);
                        return String.format("NOT ???");
                    case 8:
                        //SWAPB(opcode);
                        return String.format("SWAPB ???");
                    case 9:
                        return String.format("swap.w R%d, R%d", RM(opcode), RN(opcode));
                    case 10:
                        //NEGC(opcode);
                        return String.format("???");
                    case 11:
                        //NEG(opcode);
                        return String.format("???");
                    case 12:
                        //EXTUB(opcode);
                        return String.format("???");
                    case 13:
                        //EXTUW(opcode);
                        return String.format("???");
                    case 14:
                        //EXTSB(opcode);
                        return String.format("???");
                    case 15:
                        //EXTSW(opcode);
                        return String.format("???");
                }

            case 7: {
                int temp = (((IMM(opcode) << 24)) >> 24);
                return String.format((temp < 0) ? "sub #0x%02X, R%d" : "add #0x%02X, R%d", temp < 0 ? 0 - temp : temp, RN(opcode));
            }

            case 8:
                switch ((opcode >>> 8) & 0xf) {
                    case 0:
                        //MOVBS4(opcode);
                        return String.format("MOVBS4 ???");
                    case 1:
                        return String.format("mov.w R0, @(%d, R%d)", DISP(opcode), RM(opcode));
                    case 4:
                        //MOVBL4(opcode);
                        return String.format("MOVBL4 ???");
                    case 5:
                        //MOVWL4(opcode);
                        return String.format("MOVWL4 ???");
                    case 8:
                        //CMPIM(opcode);
                        return String.format("???");
                    case 9:
                        //BT(opcode);
                        return String.format("???");
                    case 11: {
                        int temp = (((IMM(opcode) << 24)) >> 24) * 2;
                        return String.format("bf #0x%08X", temp + (pc + 4));
                    }
                    case 13:
                        //BTS(opcode);
                        return String.format("???");
                    case 15:
                        //BFS(opcode);
                        return String.format("???");
                    default:
                        return String.format("???");
                }

            case 9:
                //MOVWI(opcode);
                return String.format("MOVWI ???");
            case 10:
                //BRA(opcode);
                return String.format("???");
            case 11:
                //BSR(opcode);
                return String.format("???");

            case 12:
                switch ((opcode >>> 8) & 0xf) {
                    case 0:
                        //MOVBSG(opcode);
                        return String.format("MOVBSG ???");
                    case 1:
                        //MOVWSG(opcode);
                        return String.format("MOVWSG ???");
                    case 2:
                        //MOVLSG(opcode);
                        return String.format("MOVLSG ???");
                    case 3:
                        //TRAPA(opcode);
                        return String.format("???");
                    case 4:
                        //MOVBLG(opcode);
                        return String.format("MOVBLG ???");
                    case 5:
                        //MOVWLG(opcode);
                        return String.format("MOVWLG ???");
                    case 6:
                        //MOVLLG(opcode);
                        return String.format("MOVLLG ???");
                    case 7:
                        //MOVA(opcode);
                        return String.format("MOVA ???");
                    case 8:
                        //TSTI(opcode);
                        return String.format("???");
                    case 9:
                        //ANDI(opcode);
                        return String.format("???");
                    case 10:
                        //XORI(opcode);
                        return String.format("???");
                    case 11:
                        //ORI(opcode);
                        return String.format("???");
                    case 12:
                        //TSTM(opcode);
                        return String.format("???");
                    case 13:
                        //ANDM(opcode);
                        return String.format("???");
                    case 14:
                        //XORM(opcode);
                        return String.format("???");
                    case 15:
                        //ORM(opcode);
                        return String.format("???");
                }

            case 13:
                //MOVLI(opcode);
                return String.format("???");
            case 14: {
                int temp = (IMM(opcode) << 24) >> 24;
                return String.format((temp < 0) ? "mov #0x%08X, R%d" : "mov #0x%02X, R%d", temp, RN(opcode));
            }

            case 15:
                switch ((opcode) & 0xf) {
                    case 0:
                        //FADD(opcode);
                        return String.format("???");
                    case 1:
                        //FSUB(opcode);
                        return String.format("???");
                    case 2:
                        //FMUL(opcode);
                        return String.format("???");
                    case 3:
                        //FDIV(opcode);
                        return String.format("???");
                    case 4:
                        //FCMPEQ(opcode);
                        return String.format("???");
                    case 5:
                        //FCMPGT(opcode);
                        return String.format("???");
                    case 6:
                        //FMOV_INDEX_LOAD(opcode);
                        return String.format("???");
                    case 7:
                        //FMOV_INDEX_STORE(opcode);
                        return String.format("???");
                    case 8:
                        //FMOV_LOAD(opcode);
                        return String.format("???");
                    case 9:
                        //FMOV_RESTORE(opcode);
                        return String.format("???");
                    case 10:
                        //FMOV_STORE(opcode);
                        return String.format("???");
                    case 11:
                        //FMOV_SAVE(opcode);
                        return String.format("???");
                    case 12:
                        //FMOV(opcode);
                        return String.format("???");

                    case 13:
                        switch ((opcode >>> 4) & 0xf) {
                            case 0:
                                //FSTS(opcode);
                                return String.format("???");
                            case 1:
                                //FLDS(opcode);
                                return String.format("???");
                            case 2:
                                //FLOAT1(opcode);
                                return String.format("???");
                            case 3:
                                //FTRC(opcode);
                                return String.format("???");
                            case 4:
                                //FNEG(opcode);
                                return String.format("???");
                            case 5:
                                //FABS(opcode);
                                return String.format("???");
                            case 6:
                                //FSQRT(opcode);
                                return String.format("???");
                            case 7:
                                //FSRRA(opcode);
                                return String.format("???");
                            case 8:
                                //FLDI0(opcode);
                                return String.format("???");
                            case 9:
                                //FLDI1(opcode);
                                return String.format("???");
                            case 10:
                                //FCNVSD(opcode);
                                return String.format("???");
                            case 11:
                                //FCNVDS(opcode);
                                return String.format("???");
                            case 14:
                                //FIPR(opcode);
                                return String.format("???");

                            case 15:
                                switch ((opcode >>> 8) & 0xf) {
                                    case 0:
                                        //FSCA(opcode);
                                        return String.format("???");
                                    case 1:
                                        //FTRV(opcode);
                                        return String.format("???");
                                    case 2:
                                        //FSCA(opcode);
                                        return String.format("???");
                                    case 3:
                                        //FSCHG(opcode);
                                        return String.format("???");
                                    case 4:
                                        //FSCA(opcode);
                                        return String.format("???");
                                    case 5:
                                        //FTRV(opcode);
                                        return String.format("???");
                                    case 6:
                                        //FSCA(opcode);
                                        return String.format("???");
                                    case 8:
                                        // FSCA(opcode);
                                        return String.format("???");
                                    case 9:
                                        //FTRV(opcode);
                                        return String.format("???");
                                    case 10:
                                        //FSCA(opcode);
                                        return String.format("???");
                                    case 11:
                                        //FRCHG(opcode);
                                        return String.format("???");
                                    case 12:
                                        //FSCA(opcode);
                                        return String.format("???");
                                    case 13:
                                        //FTRV(opcode);
                                        return String.format("???");
                                    case 14:
                                        //FSCA(opcode);
                                        return String.format("???");
                                    default:
                                        return String.format("???");
                                }

                            default:
                                return String.format("???");
                        }

                    case 14:
                        //FMAC(opcode);
                        return String.format("???");
                    case 15:
                        return String.format("???");
                }
        }
        return String.format("???");
    }
}