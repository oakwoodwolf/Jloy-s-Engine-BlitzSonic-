; ------------------------------------------------------------------------
; BlitzSonic Engine -- Classic Sonic the Hedgehog engine for Blitz 3D
; version 0.1, February 7th, 2008
;
; Copyright (C) 2008 - BlitzSonic Team.
; ------------------------------------------------------------------------
;
; This software is provided 'as-is', without any express or implied
; warranty.  In no event will the authors be held liable for any damages
; arising from the use of this software.
; 
; Permission is granted to anyone to use this software for any purpose
; (except for commercial applications) and to alter it and redistribute
; it freely subject to the following restrictions:
;
; 1. The origin of this software must not be misrepresented; you must not
;    claim that you wrote the original software. If you use this software
;    in a product, an acknowledgment in the product itself as a splash
;    screen is required.
; 2. Altered source versions must be plainly marked as such, and must not be
;    misrepresented as being the original software.
; 3. This notice may not be removed or altered from any source distribution.
;
; All characters and materials in relation to the Sonic the Hedgehog game series
; are copyrights/trademarks of SEGA of Japan (SEGA Co., LTD). This product
; has been developed without permission of SEGA, therefore it's prohibited
; to sell/make profit of it.
;
; The BlitzSonic Team:
; - Héctor "Damizean" (elgigantedeyeso at gmail dot com)
; - Mark "Cor˜E (mabc_bh at yahoo dot com dot br)
; - Streak Thunderstorm
; - Mista ED
;

;\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/;
;	Project Title : Sonic the Hedgehog                                                                         ;
; ============================================================================================================ ;
;	Author :                                                                                                   ;
;	Email :                                                                                                    ;
;	Version: 0.1                                                                                               ;
;	Date: --/--/2008                                                                                           ;
;                                                                                                              ;
;\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/;
;                                                                                                              ;
;   Changelog:  -(Damizean)------------------------------->                                                    ;
;               17/01/2008 - Code reorganization.                                                              ;
;                                                                                                              ;
;==============================================================================================================;
;                                                                                                              ;
;   TODO:                                                                                                      ;
;                                                                                                              ;
;==============================================================================================================;

; /\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/
;   VARIABLES
; /\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/	
	Dim SELECTEDCHARACTERNAME$(4)
	SELECTEDCHARACTERNAME(1)="Sonic"
	SELECTEDCHARACTERNAME(2)="Tails"
	SELECTEDCHARACTERNAME(3)="Knuckles"
	SELECTEDCHARACTERNAME(4)="Amy"
	; ---- Meshes ----
	Global Mesh_Sonic					= LoadAnimMesh("Characters/"+SELECTEDCHARACTERNAME$(1)+"/Sonic.b3d")
	ExtractCharacterSeq(Mesh_Sonic)
	HideEntity(Mesh_Sonic)
	Global Mesh_Tails					= LoadAnimMesh("Characters/"+SELECTEDCHARACTERNAME$(2)+"/Sonic.b3d")
	ExtractCharacterSeq(Mesh_Tails)
	HideEntity(Mesh_Tails)
	Global Mesh_Knuckles					= LoadAnimMesh("Characters/"+SELECTEDCHARACTERNAME$(3)+"/Sonic.b3d")
	ExtractCharacterSeq(Mesh_Knuckles)
	HideEntity(Mesh_Knuckles)
	Global Mesh_Amy					= LoadAnimMesh("Characters/"+SELECTEDCHARACTERNAME$(4)+"/Sonic.b3d")
	ExtractCharacterSeq(Mesh_Amy)
	HideEntity(Mesh_Amy)
	
	Global Mesh_Sonic_Spindash			= LoadAnimMesh("Characters/Sonic/Spindash.b3d")
	HideEntity(Mesh_Sonic_Spindash)

	Global Mesh_Sonic_JumpBall			= LoadAnimMesh("Characters/Sonic/Jump.b3d")
	HideEntity(Mesh_Sonic_JumpBall)

	Function ExtractCharacterSeq(mesh)
		RecursiveExtractAnimSeq(mesh,	0,		100)	; Idle
		RecursiveExtractAnimSeq(mesh,	101,	140)	; Walk
		RecursiveExtractAnimSeq(mesh,	141,	180)	; Jog
		RecursiveExtractAnimSeq(mesh, 181,	220)	; Run
		RecursiveExtractAnimSeq(mesh,	221,	260)	; Sprint
		RecursiveExtractAnimSeq(mesh,	261,	276)	; Spin
		RecursiveExtractAnimSeq(mesh,	277,	290)	; Fall
		RecursiveExtractAnimSeq(mesh,	291,	304)	; Rise
	End Function

;~IDEal Editor Parameters:
;~C#Blitz3D