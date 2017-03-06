package com.beyond.develop.service;



import com.beyond.develop.dto.PGDataDto;
import com.qdigo.iotsdk.dto.pg.PGPacketDto;
import com.qdigo.iotsdk.impl.CmdServiceImpl;

public class PGService {
	
	public PGPacketDto buildPgPacketDto(PGDataDto pgDataDto){
		PGPacketDto pgPacketDto = new PGPacketDto();
		pgPacketDto.setHeader0(pgDataDto.getHeader0());
		pgPacketDto.setHeader1(pgDataDto.getHeader1());
		pgPacketDto.setImei(pgDataDto.getImei());
		
		pgPacketDto.setLng(pgDataDto.getLng());
		pgPacketDto.setLat(pgDataDto.getLat());
		pgPacketDto.setHight(pgDataDto.getHight());
		pgPacketDto.setSpeed(pgDataDto.getSpeed());
		pgPacketDto.setStatus(pgDataDto.getStatus());
		pgPacketDto.setStar(pgDataDto.getStar());
		pgPacketDto.setTime(pgDataDto.getTime());
		return pgPacketDto;
	}
	
	public void sendPGData(PGPacketDto pgPacketDto){
	 CmdServiceImpl service = new CmdServiceImpl();
	 service.sendPGData(pgPacketDto);
	}
}
